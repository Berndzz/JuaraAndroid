package com.hardus.composeapp.ui.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hardus.composeapp.ui.theme.ComposeAppTheme

@Composable
fun OrderButton(
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick ,
        enabled = enabled,
        modifier = modifier
            .wrapContentWidth()
            .height(40.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun OrderButtonPreview() {
    ComposeAppTheme {
        OrderButton(
            text = "Order",
            onClick = {}
        )
    }
}