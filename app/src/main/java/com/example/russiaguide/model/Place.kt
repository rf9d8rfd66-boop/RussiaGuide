package com.example.russiaguide.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    val id: Int,
    val cityId: Int,
    @StringRes
    val name: Int,
    val category: Category,
    @StringRes
    val description: Int,
    @StringRes
    val address: Int,
    @StringRes
    val workTime: Int,
    @StringRes
    val price: Int,
    @DrawableRes
    val imageRes: Int
)