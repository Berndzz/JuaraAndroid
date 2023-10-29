package com.hardus.composeapp.ui.screen.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hardus.composeapp.R
import com.hardus.composeapp.ui.theme.ComposeAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ProfileScreen() {
    Scaffold(topBar = {
        TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            Text(
                text = "About",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }
    }) {
        ProfileBio()
    }
}

@Composable
fun ProfileBio() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .wrapContentSize(),
            elevation = 2.dp,
            backgroundColor = MaterialTheme.colors.surface,
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {
            Image(
                painterResource(R.drawable.profile_dicoding),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        Text(text = stringResource(R.string.my_name))
        Text(text = stringResource(R.string.my_email))
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ComposeAppTheme {
        ProfileBio()
    }
}