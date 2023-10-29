package com.hardus.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Sewing(
    @DrawableRes val imageResourceId : Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)
