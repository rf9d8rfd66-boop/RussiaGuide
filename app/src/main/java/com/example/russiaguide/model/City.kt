package com.example.russiaguide.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class City(
    val id: Int,
    @StringRes
    val name: Int,
    val region: Region,
    @StringRes
    val description: Int,
    @DrawableRes
    val imageRes: Int
)