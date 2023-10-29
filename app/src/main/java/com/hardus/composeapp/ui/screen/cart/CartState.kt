package com.hardus.composeapp.ui.screen.cart

import com.hardus.composeapp.model.CountTroops

data class CartState(
    val giftTroop: List<CountTroops>,
    val totalPrice: Int
)