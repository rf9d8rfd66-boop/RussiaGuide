package com.example.russiaguide.model

import androidx.annotation.StringRes
import com.example.russiaguide.R

enum class Region(
    @StringRes val titleRes: Int
) {
    CENTRAL(R.string.region_central),
    NORTHWEST(R.string.region_northwest),
    SOUTH(R.string.region_south),
    NORTH_CAUCASUS(R.string.region_north_caucasus),
    VOLGA(R.string.region_volga),
    URAL(R.string.region_ural),
    SIBERIA(R.string.region_siberia),
    FAR_EAST(R.string.region_far_east)
}