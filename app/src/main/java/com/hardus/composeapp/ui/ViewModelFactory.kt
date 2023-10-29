package com.hardus.composeapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.ui.screen.cart.CartViewModel
import com.hardus.composeapp.ui.screen.category.CategoryViewModel
import com.hardus.composeapp.ui.screen.detail.DetailTroopViewModel
import com.hardus.composeapp.ui.screen.home.HomeViewModel

class ViewModelFactory(private val repository: TroopsRepository) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(DetailTroopViewModel::class.java)) {
            return DetailTroopViewModel(repository) as T
        } else if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            return CartViewModel(repository) as T
        }else if(modelClass.isAssignableFrom(CategoryViewModel::class.java)){
            return CategoryViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}