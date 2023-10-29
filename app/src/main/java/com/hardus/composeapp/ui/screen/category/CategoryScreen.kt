package com.hardus.composeapp.ui.screen.category

import android.annotation.SuppressLint
import androidx.compose.animation.*
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.model.Troops
import com.hardus.composeapp.ui.ViewModelFactory
import com.hardus.composeapp.ui.theme.ComposeAppTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CategoryScreen(
    viewModel: CategoryViewModel = viewModel(
        factory = ViewModelFactory(
            TroopsRepository()
        )
    ),
    navigateToDetail: (Long) -> Unit
) {

    val groupTroops by viewModel.groupTroops.collectAsState()
    val query by viewModel.query
    val listState = rememberLazyListState()
    Scaffold(topBar = {
        SearchList(
            query = query,
            onQueryChange = viewModel::search,
            onCloseClicked = { viewModel.updateSearchWidgetState(newValue = SearchWidgetState.CLOSED) },
        )
    }) {
        Box(modifier = Modifier) {
            val scope = rememberCoroutineScope()
            val showButton: Boolean by remember {
                derivedStateOf { listState.firstVisibleItemIndex > 0 }
            }
            LazyColumn(
                state = listState,
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            ) {
                groupTroops.forEach { (initial, troops) ->
                    stickyHeader {
                        CharacterHeader(initial)
                    }
                    items(
                        items = troops,
                        itemContent = {
                            TroopList(
                                troop = it,
                                navigateToDetail = navigateToDetail
                            )
                        })
                }

            }
            AnimatedVisibility(
                visible = showButton,
                enter = fadeIn() + slideInVertically(),
                exit = fadeOut() + slideOutVertically(),
                modifier = Modifier
                    .padding(bottom = 30.dp, end = 20.dp)
                    .align(Alignment.BottomEnd)
            )
            {
                ScrollToTopButton(onClick = {
                    scope.launch {
                        listState.scrollToItem(index = 0)
                    }
                })

            }
        }
    }
}

@Composable
fun CharacterHeader(char: Char, modifier: Modifier = Modifier) {
    Surface(color = MaterialTheme.colors.surface, modifier = modifier) {
        Text(
            text = char.toString(),
            fontWeight = FontWeight.Black,
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
    }
}


@Composable
fun ScrollToTopButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .shadow(elevation = 2.dp, shape = CircleShape)
            .clip(shape = CircleShape)
            .size(56.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = MaterialTheme.colors.primary,
        )
    ) {
        Icon(
            imageVector = Icons.Filled.KeyboardArrowUp,
            contentDescription = null
        )
    }
}


@Composable
fun SearchList(
    query: String,
    onQueryChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        elevation = AppBarDefaults.TopAppBarElevation,
        color = MaterialTheme.colors.surface
    ) {
        TextField(modifier = Modifier.fillMaxWidth(), value = query, onValueChange = {
            onQueryChange(it)
        }, placeholder = {
            Text(
                modifier = Modifier.alpha(ContentAlpha.medium),
                text = "Search Here..",
                color = Color.Gray
            )
        }, textStyle = TextStyle(
            fontSize = MaterialTheme.typography.subtitle1.fontSize
        ), singleLine = true, leadingIcon = {
            IconButton(modifier = Modifier.alpha(ContentAlpha.medium), onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color.Black
                )
            }
        }, trailingIcon = {
            IconButton(onClick = {
                if (query.isNotEmpty()) {
                    onQueryChange("")
                } else {
                    onCloseClicked()
                }
            }) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close Icon",
                    tint = Color.Black
                )
            }
        }, colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent,
            cursorColor = Color.White.copy(alpha = ContentAlpha.medium)
        )
        )
    }
}


@Composable
fun TroopList(
    troop: Troops,
    navigateToDetail: (Long) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.surface,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(Modifier.clickable { navigateToDetail(troop.id) }) {
            ImageTroop(troop)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = troop.name, style = MaterialTheme.typography.h6)
                Text(text = "View Detail", style = MaterialTheme.typography.caption)
            }
        }
    }
}


@Composable
private fun ImageTroop(troop: Troops) {
    Image(
        painter = painterResource(id = troop.image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding()
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(12.dp)))
    )
}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    ComposeAppTheme {
        CategoryScreen(navigateToDetail = {})
    }
}