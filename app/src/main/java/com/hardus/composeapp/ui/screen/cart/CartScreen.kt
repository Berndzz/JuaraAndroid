package com.hardus.composeapp.ui.screen.cart

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hardus.composeapp.R
import com.hardus.composeapp.di.Injection
import com.hardus.composeapp.ui.ViewModelFactory
import com.hardus.composeapp.ui.common.UiState
import com.hardus.composeapp.ui.component.GiftOrder
import com.hardus.composeapp.ui.component.OrderButton

@Composable
fun CartScreen(
    viewModel: CartViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    onOrderButtonClicked: (String) -> Unit,
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAddOrderTroops()
            }
            is UiState.Success -> {
                CartContent(
                    uiState.data,
                    onGiftCountChanged = { troopId, count ->
                        viewModel.updateOrderReward(troopId,count)
                    },
                    onOrderButtonClicked = onOrderButtonClicked
                )
            }
            is UiState.Error -> {

            }
        }
    }
}

@Composable
fun CartContent(
    state: CartState,
    onGiftCountChanged: (id: Long, count: Int) -> Unit,
    onOrderButtonClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {

    val shareMessage = stringResource(
        id = R.string.share_message,
        state.giftTroop.count(),
        state.totalPrice
    )
    Column(modifier = modifier.fillMaxWidth()) {
        TopAppBar(backgroundColor = MaterialTheme.colors.surface) {
            Text(
                text = stringResource(id = R.string.menu_cart),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(state.giftTroop, key = { it.troops.id }) { item ->
                GiftOrder(
                    troopId = item.troops.id,
                    image = item.troops.image,
                    name = item.troops.name,
                    price = item.troops.price,
                    count = item.count,
                    onGiftCountChanged = onGiftCountChanged,
                )
                Divider()
            }
        }
        OrderButton(
            text = stringResource(id = R.string.total_order, state.totalPrice),
            enabled = state.giftTroop.isNotEmpty(),
            onClick = {onOrderButtonClicked(shareMessage)},
            modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally)
        )
    }
}

