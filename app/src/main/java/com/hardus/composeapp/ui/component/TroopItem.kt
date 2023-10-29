package com.hardus.composeapp.ui.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hardus.composeapp.R
import com.hardus.composeapp.ui.theme.ComposeAppTheme
import com.hardus.composeapp.ui.theme.Shapes

@Composable
fun TroopItem(
    image: Int,
    name: String,
    price: Int,
    modifier: Modifier = Modifier
) {
    Card( modifier = Modifier
        .padding(horizontal = 8.dp, vertical = 8.dp)
        .wrapContentSize(),
        elevation = 2.dp,
        backgroundColor = MaterialTheme.colors.surface,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = name,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(Shapes.medium)
            )
            Text(
                text = stringResource(id = R.string.price, price),
                style = MaterialTheme.typography.subtitle2,
                color = MaterialTheme.colors.primary
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TroopItemPreview() {
    ComposeAppTheme {
        TroopItem(image = R.drawable.electro_titan, name = "Electro Titan", price = 75)
    }
}