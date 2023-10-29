package com.hardus.composeapp.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.model.CountTroops
import com.hardus.composeapp.model.Troops
import com.hardus.composeapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailTroopViewModel(private val repository: TroopsRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<CountTroops>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<CountTroops>>
        get() = _uiState

    fun getTroopById(troopId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getOrderTroopsById(troopId))
        }
    }


    fun addToCart(troop: Troops, count: Int) {
        viewModelScope.launch {
            repository.updateTroops(troop.id, count)
        }
    }


}