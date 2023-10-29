package com.hardus.composeapp.di

import com.hardus.composeapp.data.TroopsRepository
import com.hardus.composeapp.data.TroopsRepository.Companion.getInstance

object Injection {
    fun provideRepository(): TroopsRepository{
        return getInstance()
    }
}



