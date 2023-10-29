package com.hardus.composeapp.ui.screen.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CartViewModel(private val repository: TroopsRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<CartState>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<CartState>>
        get() = _uiState

    fun getAddOrderTroops() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getAddOrderTroops()
                .collect { orderTroop ->
                    val totalPrice =
                        orderTroop.sumOf { it.troops.price * it.count }
                    _uiState.value = UiState.Success(CartState(orderTroop, totalPrice))
                }
        }
    }

    fun updateOrderReward(troopId: Long, count: Int) {
        viewModelScope.launch {
            repository.updateTroops(troopId, count)
                .collect { isUpdated ->
                    if (isUpdated) {
                        getAddOrderTroops()
                    }
                }
        }
    }
}