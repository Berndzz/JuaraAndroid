package com.hardus.composeapp.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hardus.composeapp.ui.theme.ComposeAppTheme

@Composable
fun GiftCounter(
    orderId: Long, orderCount: Int,
    onGiftIncreased: (Long) -> Unit,
    onGiftDecreased: (Long) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .size(width = 110.dp, height = 40.dp)
            .padding(4.dp)
    ) {
        Surface(
            shape = RoundedCornerShape(size = 5.dp),
            border = BorderStroke(1.dp, MaterialTheme.colors.primary),
            color = Color.Transparent,
            contentColor = MaterialTheme.colors.primary,
            modifier = Modifier.size(30.dp)
        ) {
            Text(
                text = "—",
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onGiftDecreased(orderId)
                    }
            )
        }
        Text(
            text = orderCount.toString(),
            modifier = Modifier.weight(1f),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Surface(
            shape = RoundedCornerShape(size = 5.dp),
            border = BorderStroke(1.dp, MaterialTheme.colors.primary),
            color = Color.Transparent,
            contentColor = MaterialTheme.colors.primary,
            modifier = Modifier.size(30.dp)
        ) {
            Text(
                text = "+",
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onGiftIncreased(orderId)
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GiftCounterPreview() {
    ComposeAppTheme {
        GiftCounter(1, 0, {}, {})
    }
}