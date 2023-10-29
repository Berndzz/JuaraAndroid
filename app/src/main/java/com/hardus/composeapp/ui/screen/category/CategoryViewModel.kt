package com.hardus.composeapp.ui.screen.category

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.model.Troops
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CategoryViewModel(private val repository: TroopsRepository) : ViewModel() {
    private val _groupedTroops = MutableStateFlow(
        repository.getTroop().sortedBy { it.name }
            .groupBy { it.name[0] }
    )

    private val _searchWidgetState: MutableState<SearchWidgetState> =
        mutableStateOf(value = SearchWidgetState.CLOSED)

    val groupTroops: StateFlow<Map<Char, List<Troops>>> get() = _groupedTroops
    private val _query = mutableStateOf("")
    val query: State<String> get() = _query

    fun updateSearchWidgetState(newValue: SearchWidgetState) {
        _searchWidgetState.value = newValue
    }


    fun search(newQuery: String) {
        _query.value = newQuery
        _groupedTroops.value = repository.searchTroop(_query.value)
            .sortedBy { it.name }.groupBy { it.name[0] }
    }
}