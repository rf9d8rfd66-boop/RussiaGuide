package com.example.russiaguide.data

import com.example.russiaguide.R
import com.example.russiaguide.model.Category
import com.example.russiaguide.model.Place

val places = listOf(


    // --- МОСКВА ---

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
    ),

    // --- САНКТ-ПЕТЕРБУРГ ---
    Place(
        id = 5,
        cityId = 3,
        name = R.string.place_hermitage,
        category = Category.ATTRACTION,
        description = R.string.place_hermitage_description,
        address = R.string.place_hermitage_address,
        workTime = R.string.place_hermitage_time,
        price = R.string.place_hermitage_price,
        imageRes = R.drawable.place_hermitage
    ),
    Place(
        id = 6,
        cityId = 3,
        name = R.string.place_pyshechnaya,
        category = Category.CAFE,
        description = R.string.place_pyshechnaya_description,
        address = R.string.place_pyshechnaya_address,
        workTime = R.string.place_pyshechnaya_time,
        price = R.string.place_pyshechnaya_price,
        imageRes = R.drawable.place_pyshechnaya
    ),
    Place(
        id = 7,
        cityId = 3,
        name = R.string.place_astoria_hotel,
        category = Category.HOTEL,
        description = R.string.place_astoria_hotel_description,
        address = R.string.place_astoria_hotel_address,
        workTime = R.string.place_astoria_hotel_time,
        price = R.string.place_astoria_hotel_price,
        imageRes = R.drawable.place_astoria_hotel
    ),
    Place(
        id = 8,
        cityId = 3,
        name = R.string.place_mariinsky,
        category = Category.ENTERTAINMENT,
        description = R.string.place_mariinsky_description,
        address = R.string.place_mariinsky_address,
        workTime = R.string.place_mariinsky_time,
        price = R.string.place_mariinsky_price,
        imageRes = R.drawable.place_mariinsky_theatre
    ),


    // --- СОЧИ ---
    Place(
        id = 9,
        cityId = 5,
        name = R.string.place_riviera,
        category = Category.ATTRACTION,
        description = R.string.place_riviera_description,
        address = R.string.place_riviera_address,
        workTime = R.string.place_riviera_time,
        price = R.string.place_riviera_price,
        imageRes = R.drawable.place_riviera
    ),
    Place(
        id = 10,
        cityId = 5,
        name = R.string.place_sochi_cafe,
        category = Category.CAFE,
        description = R.string.place_sochi_cafe_description,
        address = R.string.place_sochi_cafe_address,
        workTime = R.string.place_sochi_cafe_time,
        price = R.string.place_sochi_cafe_price,
        imageRes = R.drawable.place_sochi_cafe
    ),
    Place(
        id = 11,
        cityId = 5,
        name = R.string.place_sochi_hotel,
        category = Category.HOTEL,
        description = R.string.place_sochi_hotel_description,
        address = R.string.place_sochi_hotel_address,
        workTime = R.string.place_sochi_hotel_time,
        price = R.string.place_sochi_hotel_price,
        imageRes = R.drawable.place_sochi_hotel
    ),
    Place(
        id = 12,
        cityId = 5,
        name = R.string.place_sochi_park,
        category = Category.ENTERTAINMENT,
        description = R.string.place_sochi_park_description,
        address = R.string.place_sochi_park_address,
        workTime = R.string.place_sochi_park_time,
        price = R.string.place_sochi_park_price,
        imageRes = R.drawable.place_sochi_park
    ),


    // --- КАЗАНЬ ---
    Place(
        id = 13,
        cityId = 9,
        name = R.string.place_kazan_kremlin,
        category = Category.ATTRACTION,
        description = R.string.place_kazan_kremlin_description,
        address = R.string.place_kazan_kremlin_address,
        workTime = R.string.place_kazan_kremlin_time,
        price = R.string.place_kazan_kremlin_price,
        imageRes = R.drawable.place_kazan_kremlin
    ),
    Place(
        id = 14,
        cityId = 9,
        name = R.string.place_eniem,
        category = Category.CAFE,
        description = R.string.place_eniem_description,
        address = R.string.place_eniem_address,
        workTime = R.string.place_eniem_time,
        price = R.string.place_eniem_price,
        imageRes = R.drawable.place_eniem
    ),
    Place(
        id = 15,
        cityId = 9,
        name = R.string.place_kazan_hotel,
        category = Category.HOTEL,
        description = R.string.place_kazan_hotel_description,
        address = R.string.place_kazan_hotel_address,
        workTime = R.string.place_kazan_hotel_time,
        price = R.string.place_kazan_hotel_price,
        imageRes = R.drawable.place_kazan_hotel
    ),
    Place(
        id = 16,
        cityId = 9,
        name = R.string.place_kazan_circus,
        category = Category.ENTERTAINMENT,
        description = R.string.place_kazan_circus_description,
        address = R.string.place_kazan_circus_address,
        workTime = R.string.place_kazan_circus_time,
        price = R.string.place_kazan_circus_price,
        imageRes = R.drawable.place_kazan_circus
    )




)