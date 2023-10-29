package com.hardus.composeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
fun GiftOrder(
    troopId: Long,
    image: Int,
    name: String,
    price: Int,
    count: Int,
    onGiftCountChanged: (id: Long, count: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(90.dp)
                .clip(Shapes.small)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .weight(1.0f)
        ) {
            Text(
                text = name,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.ExtraBold
                )
            )
            Text(
                text = stringResource(id = R.string.price, price),
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.subtitle2
            )
        }
        GiftCounter(
            orderId = troopId,
            orderCount = count,
            onGiftIncreased = { onGiftCountChanged(troopId, count + 1) },
            onGiftDecreased = { onGiftCountChanged(troopId, count - 1) },
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GiftOrderPreview() {
    ComposeAppTheme {
        GiftOrder(
            troopId = 1,
            image = R.drawable.electro_titan,
            name = "Electro Titan",
            price = 75,
            0,
            onGiftCountChanged = { troopId, count -> }
        )
    }
}