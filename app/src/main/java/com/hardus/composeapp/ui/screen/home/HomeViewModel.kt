package com.hardus.composeapp.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.model.CountTroops
import com.hardus.composeapp.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: TroopsRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<CountTroops>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<CountTroops>>>
        get() = _uiState


    fun getAllTroop() {
        viewModelScope.launch {
            repository.getAllTroops()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { orderTroop ->
                    _uiState.value = UiState.Success(orderTroop)
                }
        }
    }
}