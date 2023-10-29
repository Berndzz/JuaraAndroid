package com.hardus.composeapp.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hardus.composeapp.R
import com.hardus.composeapp.di.Injection
import com.hardus.composeapp.model.CountTroops
import com.hardus.composeapp.ui.ViewModelFactory
import com.hardus.composeapp.ui.common.UiState
import com.hardus.composeapp.ui.component.TroopItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Long) -> Unit,
) {

    Column(modifier = modifier) {
        TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            Text(
                text = stringResource(R.string.coc_title_home),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAllTroop()
                }
                is UiState.Success -> {
                    HomeContent(
                        orderTroops = uiState.data,
                        modifier = modifier,
                        navigateToDetail = navigateToDetail,
                    )

                }
                is UiState.Error -> {
                }
            }
        }

    }
}


@Composable
fun HomeContent(
    orderTroops: List<CountTroops>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            contentPadding = PaddingValues(15.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier
        ) {
            items(orderTroops) { data ->
                TroopItem(
                    image = data.troops.image,
                    name = data.troops.name,
                    price = data.troops.price,
                    modifier = Modifier.clickable {
                        navigateToDetail(data.troops.id)
                    }
                )
            }
        }
    }
}


