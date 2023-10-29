package com.hardus.myapplication.screen

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hardus.myapplication.R
import com.hardus.myapplication.data.Datasource.loadSewing.sewing
import com.hardus.myapplication.model.Sewing
import com.hardus.myapplication.ui.theme.MyApplicationTheme
import com.hardus.myapplication.ui.theme.Shapes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SewingApp() {
    Scaffold(topBar = {
        SewingTopAppBar()
    }) { it ->
        LazyColumn(contentPadding = it) {
            items(sewing) {
                val day = sewing.indexOf(it) + 1
                SewingCard(sewing = it, day = day)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SewingCard(sewing: Sewing, day: Int) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .animateContentSize(
                spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMedium
                )
            ),
        shape = Shapes.medium,
        onClick = {
            expanded = !expanded
        },
    ) {
        SewingInformation(
            sewingTitle = sewing.title,
            sewingPhoto = sewing.imageResourceId,
            day = day
        )
        if (expanded) {
            SewingDescription(sewingDescription = sewing.description)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SewingTopAppBar() {
    //val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_topBar),
                style = MaterialTheme.typography.displayMedium
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        scrollBehavior = scrollBehavior
    )
}


@Composable
fun SewingInformation(
    @StringRes sewingTitle: Int,
    @DrawableRes sewingPhoto: Int,
    day: Int
) {

    Column {
        Text(
            text = "Day $day",
            style = MaterialTheme.typography.labelSmall,
            modifier = Modifier.padding(start = 10.dp, top = 12.dp)
        )
        Text(
            text = stringResource(id = sewingTitle),
            modifier = Modifier.padding(start = 10.dp, bottom = 10.dp, end = 10.dp, top = 10.dp),
            style = MaterialTheme.typography.displayMedium
        )
        Image(
            painter = painterResource(id = sewingPhoto),
            contentDescription = stringResource(id = sewingTitle),
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun SewingDescription(
    @StringRes sewingDescription: Int, modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {
        Text(
            text = stringResource(id = sewingDescription),
            modifier = Modifier.padding(start = 10.dp, bottom = 8.dp)
        )
    }
}


@Preview(showBackground = true, showSystemUi = false, name = "Hardus")
@Composable
fun LightTheme() {
    MyApplicationTheme {
        SewingCard(
            Sewing(R.drawable.image__1_, R.string.day_1_title, R.string.day_1_description), day = 1
        )
    }
}

@Preview(showBackground = true, showSystemUi = false, name = "Hardus")
@Composable
fun DarkTheme() {
    MyApplicationTheme(darkTheme = true) {
        SewingCard(
            Sewing(R.drawable.image__1_, R.string.day_1_title, R.string.day_1_description), day = 1
        )
    }
}