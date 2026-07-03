package com.example.russiaguide.data

import com.example.russiaguide.R
import com.example.russiaguide.model.Category
import com.example.russiaguide.model.Place

val places = listOf(

    Place(
        id = 1,
        cityId = 1,
        name = R.string.place_red_square,
        category = Category.ATTRACTION,
        description = R.string.place_red_square_description,
        address = R.string.place_red_square_address,
        workTime = R.string.place_red_square_time,
        price = R.string.place_red_square_price,
        imageRes = R.drawable.place_red_square
    ),

    Place(
        id = 2,
        cityId = 1,
        name = R.string.place_coffeemania,
        category = Category.CAFE,
        description = R.string.place_coffeemania_description,
        address = R.string.place_coffeemania_address,
        workTime = R.string.place_coffeemania_time,
        price = R.string.place_coffeemania_price,
        imageRes = R.drawable.place_coffeemania
    ),

    Place(
        id = 3,
        cityId = 1,
        name = R.string.place_cosmos_hotel,
        category = Category.HOTEL,
        description = R.string.place_cosmos_hotel_description,
        address = R.string.place_cosmos_hotel_address,
        workTime = R.string.place_cosmos_hotel_time,
        price = R.string.place_cosmos_hotel_price,
        imageRes = R.drawable.place_cosmos_hotel
    ),

    Place(
        id = 4,
        cityId = 1,
        name = R.string.place_zaryadye,
        category = Category.ENTERTAINMENT,
        description = R.string.place_zaryadye_description,
        address = R.string.place_zaryadye_address,
        workTime = R.string.place_zaryadye_time,
        price = R.string.place_zaryadye_price,
        imageRes = R.drawable.place_zaryadye
    )

)