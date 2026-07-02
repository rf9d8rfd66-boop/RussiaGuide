package com.example.russiaguide.model

import androidx.annotation.StringRes
import com.example.russiaguide.R

enum class Category(
    @StringRes val titleRes: Int
) {
    ATTRACTION(R.string.category_attraction),
    CAFE(R.string.category_cafe),
    HOTEL(R.string.category_hotel),
    ENTERTAINMENT(R.string.category_entertainment)
}