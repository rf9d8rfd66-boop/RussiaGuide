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
        name = R.string.place_kauri,
        category = Category.CAFE,
        description = R.string.place_kauri_description,
        address = R.string.place_kauri_address,
        workTime = R.string.place_kauri_time,
        price = R.string.place_kauri_price,
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
    ),


    // --- ЯРОСЛАВЛЬ ---
    Place(
        id = 17,
        cityId = 2,
        name = R.string.place_yaroslavl_monastery,
        category = Category.ATTRACTION,
        description = R.string.place_yaroslavl_monastery_description,
        address = R.string.place_yaroslavl_monastery_address,
        workTime = R.string.place_yaroslavl_monastery_time,
        price = R.string.place_yaroslavl_monastery_price,
        imageRes = R.drawable.place_yaroslavl_monastery
    ),
    Place(
        id = 18,
        cityId = 2,
        name = R.string.place_yaroslavl_ioann,
        category = Category.CAFE,
        description = R.string.place_yaroslavl_ioann_description,
        address = R.string.place_yaroslavl_ioann_address,
        workTime = R.string.place_yaroslavl_ioann_time,
        price = R.string.place_yaroslavl_ioann_price,
        imageRes = R.drawable.place_yaroslavl_ioann
    ),
    Place(
        id = 19,
        cityId = 2,
        name = R.string.place_yaroslavl_aleksha,
        category = Category.HOTEL,
        description = R.string.place_yaroslavl_aleksha_description,
        address = R.string.place_yaroslavl_aleksha_address,
        workTime = R.string.place_yaroslavl_aleksha_time,
        price = R.string.place_yaroslavl_aleksha_price,
        imageRes = R.drawable.place_yaroslavl_aleksha
    ),
    Place(
        id = 20,
        cityId = 2,
        name = R.string.place_yaroslavl_volkov,
        category = Category.ENTERTAINMENT,
        description = R.string.place_yaroslavl_volkov_description,
        address = R.string.place_yaroslavl_volkov_address,
        workTime = R.string.place_yaroslavl_volkov_time,
        price = R.string.place_yaroslavl_volkov_price,
        imageRes = R.drawable.place_yaroslavl_volkov
    ),

    // --- КАЛИНИНГРАД ---
    Place(
        id = 21,
        cityId = 4,
        name = R.string.place_kaliningrad_cathedral,
        category = Category.ATTRACTION,
        description = R.string.place_kaliningrad_cathedral_description,
        address = R.string.place_kaliningrad_cathedral_address,
        workTime = R.string.place_kaliningrad_cathedral_time,
        price = R.string.place_kaliningrad_cathedral_price,
        imageRes = R.drawable.place_kaliningrad_cathedral
    ),
    Place(
        id = 22,
        cityId = 4,
        name = R.string.place_kaliningrad_madame_bushe,
        category = Category.CAFE,
        description = R.string.place_kaliningrad_madame_bushe_description,
        address = R.string.place_kaliningrad_madame_bushe_address,
        workTime = R.string.place_kaliningrad_madame_bushe_time,
        price = R.string.place_kaliningrad_madame_bushe_price,
        imageRes = R.drawable.place_kaliningrad_madame_bushe
    ),
    Place(
        id = 23,
        cityId = 4,
        name = R.string.place_kaliningrad_crown39,
        category = Category.HOTEL,
        description = R.string.place_kaliningrad_crown39_description,
        address = R.string.place_kaliningrad_crown39_address,
        workTime = R.string.place_kaliningrad_crown39_time,
        price = R.string.place_kaliningrad_crown39_price,
        imageRes = R.drawable.place_kaliningrad_crown39
    ),
    Place(
        id = 24,
        cityId = 4,
        name = R.string.place_kaliningrad_ocean,
        category = Category.ENTERTAINMENT,
        description = R.string.place_kaliningrad_ocean_description,
        address = R.string.place_kaliningrad_ocean_address,
        workTime = R.string.place_kaliningrad_ocean_time,
        price = R.string.place_kaliningrad_ocean_price,
        imageRes = R.drawable.place_kaliningrad_ocean
    ),

    // --- КРАСНОДАР ---
    Place(
        id = 25,
        cityId = 6,
        name = R.string.place_krasnodar_park,
        category = Category.ATTRACTION,
        description = R.string.place_krasnodar_park_description,
        address = R.string.place_krasnodar_park_address,
        workTime = R.string.place_krasnodar_park_time,
        price = R.string.place_krasnodar_park_price,
        imageRes = R.drawable.place_krasnodar_park
    ),
    Place(
        id = 26,
        cityId = 6,
        name = R.string.place_krasnodar_ptichka,
        category = Category.CAFE,
        description = R.string.place_krasnodar_ptichka_description,
        address = R.string.place_krasnodar_ptichka_address,
        workTime = R.string.place_krasnodar_ptichka_time,
        price = R.string.place_krasnodar_ptichka_price,
        imageRes = R.drawable.place_krasnodar_ptichka
    ),
    Place(
        id = 27,
        cityId = 6,
        name = R.string.place_krasnodar_hilton,
        category = Category.HOTEL,
        description = R.string.place_krasnodar_hilton_description,
        address = R.string.place_krasnodar_hilton_address,
        workTime = R.string.place_krasnodar_hilton_time,
        price = R.string.place_krasnodar_hilton_price,
        imageRes = R.drawable.place_krasnodar_hilton
    ),
    Place(
        id = 28,
        cityId = 6,
        name = R.string.place_krasnodar_museum_kovalenko,
        category = Category.ENTERTAINMENT,
        description = R.string.place_krasnodar_museum_kovalenko_description,
        address = R.string.place_krasnodar_museum_kovalenko_address,
        workTime = R.string.place_krasnodar_museum_kovalenko_time,
        price = R.string.place_krasnodar_museum_kovalenko_price,
        imageRes = R.drawable.place_krasnodar_museum_kovalenko
    ),

    // --- ПЯТИГОРСК ---
    Place(
        id = 29,
        cityId = 7,
        name = R.string.place_pyatigorsk_proval,
        category = Category.ATTRACTION,
        description = R.string.place_pyatigorsk_proval_description,
        address = R.string.place_pyatigorsk_proval_address,
        workTime = R.string.place_pyatigorsk_proval_time,
        price = R.string.place_pyatigorsk_proval_price,
        imageRes = R.drawable.place_pyatigorsk_proval
    ),
    Place(
        id = 30,
        cityId = 7,
        name = R.string.place_pyatigorsk_mountain,
        category = Category.CAFE,
        description = R.string.place_pyatigorsk_mountain_description,
        address = R.string.place_pyatigorsk_mountain_address,
        workTime = R.string.place_pyatigorsk_mountain_time,
        price = R.string.place_pyatigorsk_mountain_price,
        imageRes = R.drawable.place_pyatigorsk_mountain
    ),
    Place(
        id = 31,
        cityId = 7,
        name = R.string.place_pyatigorsk_beshtau,
        category = Category.HOTEL,
        description = R.string.place_pyatigorsk_beshtau_description,
        address = R.string.place_pyatigorsk_beshtau_address,
        workTime = R.string.place_pyatigorsk_beshtau_time,
        price = R.string.place_pyatigorsk_beshtau_price,
        imageRes = R.drawable.place_pyatigorsk_beshtau
    ),
    Place(
        id = 32,
        cityId = 7,
        name = R.string.place_pyatigorsk_mashuk,
        category = Category.ENTERTAINMENT,
        description = R.string.place_pyatigorsk_mashuk_description,
        address = R.string.place_pyatigorsk_mashuk_address,
        workTime = R.string.place_pyatigorsk_mashuk_time,
        price = R.string.place_pyatigorsk_mashuk_price,
        imageRes = R.drawable.place_pyatigorsk_mashuk
    ),

    // --- КИСЛОВОДСК ---
    Place(
        id = 33,
        cityId = 8,
        name = R.string.place_kislovodsk_park,
        category = Category.ATTRACTION,
        description = R.string.place_kislovodsk_park_description,
        address = R.string.place_kislovodsk_park_address,
        workTime = R.string.place_kislovodsk_park_time,
        price = R.string.place_kislovodsk_park_price,
        imageRes = R.drawable.place_kislovodsk_park
    ),
    Place(
        id = 34,
        cityId = 8,
        name = R.string.place_kislovodsk_shafran,
        category = Category.CAFE,
        description = R.string.place_kislovodsk_shafran_description,
        address = R.string.place_kislovodsk_shafran_address,
        workTime = R.string.place_kislovodsk_shafran_time,
        price = R.string.place_kislovodsk_shafran_price,
        imageRes = R.drawable.place_kislovodsk_shafran
    ),
    Place(
        id = 35,
        cityId = 8,
        name = R.string.place_kislovodsk_bristol,
        category = Category.HOTEL,
        description = R.string.place_kislovodsk_bristol_description,
        address = R.string.place_kislovodsk_bristol_address,
        workTime = R.string.place_kislovodsk_bristol_time,
        price = R.string.place_kislovodsk_bristol_price,
        imageRes = R.drawable.place_kislovodsk_bristol
    ),
    Place(
        id = 36,
        cityId = 8,
        name = R.string.place_kislovodsk_cable,
        category = Category.ENTERTAINMENT,
        description = R.string.place_kislovodsk_cable_description,
        address = R.string.place_kislovodsk_cable_address,
        workTime = R.string.place_kislovodsk_cable_time,
        price = R.string.place_kislovodsk_cable_price,
        imageRes = R.drawable.place_kislovodsk_cable
    ),

    // --- НИЖНИЙ НОВГОРОД ---
    Place(
        id = 37,
        cityId = 10,
        name = R.string.place_nn_kremlin,
        category = Category.ATTRACTION,
        description = R.string.place_nn_kremlin_description,
        address = R.string.place_nn_kremlin_address,
        workTime = R.string.place_nn_kremlin_time,
        price = R.string.place_nn_kremlin_price,
        imageRes = R.drawable.place_nn_kremlin
    ),
    Place(
        id = 38,
        cityId = 10,
        name = R.string.place_nn_mitrich,
        category = Category.CAFE,
        description = R.string.place_nn_mitrich_description,
        address = R.string.place_nn_mitrich_address,
        workTime = R.string.place_nn_mitrich_time,
        price = R.string.place_nn_mitrich_price,
        imageRes = R.drawable.place_nn_mitrich
    ),
    Place(
        id = 39,
        cityId = 10,
        name = R.string.place_nn_sheraton,
        category = Category.HOTEL,
        description = R.string.place_nn_sheraton_description,
        address = R.string.place_nn_sheraton_address,
        workTime = R.string.place_nn_sheraton_time,
        price = R.string.place_nn_sheraton_price,
        imageRes = R.drawable.place_nn_sheraton
    ),
    Place(
        id = 40,
        cityId = 10,
        name = R.string.place_nn_maze,
        category = Category.ENTERTAINMENT,
        description = R.string.place_nn_maze_description,
        address = R.string.place_nn_maze_address,
        workTime = R.string.place_nn_maze_time,
        price = R.string.place_nn_maze_price,
        imageRes = R.drawable.place_nn_maze
    ),


    // --- ЕКАТЕРИНБУРГ ---
    Place(
        id = 41,
        cityId = 11,
        name = R.string.place_ekb_church,
        category = Category.ATTRACTION,
        description = R.string.place_ekb_church_description,
        address = R.string.place_ekb_church_address,
        workTime = R.string.place_ekb_church_time,
        price = R.string.place_ekb_church_price,
        imageRes = R.drawable.place_ekb_church
    ),
    Place(
        id = 42,
        cityId = 11,
        name = R.string.place_ekb_syrovarnya,
        category = Category.CAFE,
        description = R.string.place_ekb_syrovarnya_description,
        address = R.string.place_ekb_syrovarnya_address,
        workTime = R.string.place_ekb_syrovarnya_time,
        price = R.string.place_ekb_syrovarnya_price,
        imageRes = R.drawable.place_ekb_syrovarnya
    ),
    Place(
        id = 43,
        cityId = 11,
        name = R.string.place_ekb_stepanenkov,
        category = Category.HOTEL,
        description = R.string.place_ekb_stepanenkov_description,
        address = R.string.place_ekb_stepanenkov_address,
        workTime = R.string.place_ekb_stepanenkov_time,
        price = R.string.place_ekb_stepanenkov_price,
        imageRes = R.drawable.place_ekb_stepanenkov
    ),
    Place(
        id = 44,
        cityId = 11,
        name = R.string.place_ekb_oceanarium,
        category = Category.ENTERTAINMENT,
        description = R.string.place_ekb_oceanarium_description,
        address = R.string.place_ekb_oceanarium_address,
        workTime = R.string.place_ekb_oceanarium_time,
        price = R.string.place_ekb_oceanarium_price,
        imageRes = R.drawable.place_ekb_oceanarium
    ),

    // --- ТЮМЕНЬ ---
    Place(
        id = 45,
        cityId = 12,
        name = R.string.place_tyumen_embankment,
        category = Category.ATTRACTION,
        description = R.string.place_tyumen_embankment_description,
        address = R.string.place_tyumen_embankment_address,
        workTime = R.string.place_tyumen_embankment_time,
        price = R.string.place_tyumen_embankment_price,
        imageRes = R.drawable.place_tyumen_embankment
    ),
    Place(
        id = 46,
        cityId = 12,
        name = R.string.place_tyumen_1586,
        category = Category.CAFE,
        description = R.string.place_tyumen_1586_description,
        address = R.string.place_tyumen_1586_address,
        workTime = R.string.place_tyumen_1586_time,
        price = R.string.place_tyumen_1586_price,
        imageRes = R.drawable.place_tyumen_1586
    ),
    Place(
        id = 47,
        cityId = 12,
        name = R.string.place_tyumen_azimut,
        category = Category.HOTEL,
        description = R.string.place_tyumen_azimut_description,
        address = R.string.place_tyumen_azimut_address,
        workTime = R.string.place_tyumen_azimut_time,
        price = R.string.place_tyumen_azimut_price,
        imageRes = R.drawable.place_tyumen_azimut
    ),
    Place(
        id = 48,
        cityId = 12,
        name = R.string.place_tyumen_letoleto,
        category = Category.ENTERTAINMENT,
        description = R.string.place_tyumen_letoleto_description,
        address = R.string.place_tyumen_letoleto_address,
        workTime = R.string.place_tyumen_letoleto_time,
        price = R.string.place_tyumen_letoleto_price,
        imageRes = R.drawable.place_tyumen_letoleto
    ),

    // --- НОВОСИБИРСК ---
    Place(
        id = 49,
        cityId = 13,
        name = R.string.place_nsk_opera,
        category = Category.ATTRACTION,
        description = R.string.place_nsk_opera_description,
        address = R.string.place_nsk_opera_address,
        workTime = R.string.place_nsk_opera_time,
        price = R.string.place_nsk_opera_price,
        imageRes = R.drawable.place_nsk_opera
    ),
    Place(
        id = 50,
        cityId = 13,
        name = R.string.place_nsk_hot_shop,
        category = Category.CAFE,
        description = R.string.place_nsk_hot_shop_description,
        address = R.string.place_nsk_hot_shop_address,
        workTime = R.string.place_nsk_hot_shop_time,
        price = R.string.place_nsk_hot_shop_price,
        imageRes = R.drawable.place_nsk_hot_shop
    ),
    Place(
        id = 51,
        cityId = 13,
        name = R.string.place_nsk_river_park,
        category = Category.HOTEL,
        description = R.string.place_nsk_river_park_description,
        address = R.string.place_nsk_river_park_address,
        workTime = R.string.place_nsk_river_park_time,
        price = R.string.place_nsk_river_park_price,
        imageRes = R.drawable.place_nsk_river_park
    ),
    Place(
        id = 52,
        cityId = 13,
        name = R.string.place_nsk_zoo,
        category = Category.ENTERTAINMENT,
        description = R.string.place_nsk_zoo_description,
        address = R.string.place_nsk_zoo_address,
        workTime = R.string.place_nsk_zoo_time,
        price = R.string.place_nsk_zoo_price,
        imageRes = R.drawable.place_nsk_zoo
    ),


    // --- ИРКУТСК ---
    Place(
        id = 53,
        cityId = 14,
        name = R.string.place_irkutsk_130,
        category = Category.ATTRACTION,
        description = R.string.place_irkutsk_130_description,
        address = R.string.place_irkutsk_130_address,
        workTime = R.string.place_irkutsk_130_time,
        price = R.string.place_irkutsk_130_price,
        imageRes = R.drawable.place_irkutsk_130
    ),
    Place(
        id = 54,
        cityId = 14,
        name = R.string.place_irkutsk_partizan,
        category = Category.CAFE,
        description = R.string.place_irkutsk_partizan_description,
        address = R.string.place_irkutsk_partizan_address,
        workTime = R.string.place_irkutsk_partizan_time,
        price = R.string.place_irkutsk_partizan_price,
        imageRes = R.drawable.place_irkutsk_partizan
    ),
    Place(
        id = 55,
        cityId = 14,
        name = R.string.place_irkutsk_city_center,
        category = Category.HOTEL,
        description = R.string.place_irkutsk_city_center_description,
        address = R.string.place_irkutsk_city_center_address,
        workTime = R.string.place_irkutsk_city_center_time,
        price = R.string.place_irkutsk_city_center_price,
        imageRes = R.drawable.place_irkutsk_city_center
    ),
    Place(
        id = 56,
        cityId = 14,
        name = R.string.place_irkutsk_extravert,
        category = Category.ENTERTAINMENT,
        description = R.string.place_irkutsk_extravert_description,
        address = R.string.place_irkutsk_extravert_address,
        workTime = R.string.place_irkutsk_extravert_time,
        price = R.string.place_irkutsk_extravert_price,
        imageRes = R.drawable.place_irkutsk_extravert
    ),


    // --- ВЛАДИВОСТОК ---
    Place(
        id = 57,
        cityId = 15,
        name = R.string.place_vladivostok_fokina,
        category = Category.ATTRACTION,
        description = R.string.place_vladivostok_fokina_description,
        address = R.string.place_vladivostok_fokina_address,
        workTime = R.string.place_vladivostok_fokina_time,
        price = R.string.place_vladivostok_fokina_price,
        imageRes = R.drawable.place_vladivostok_fokina
    ),
    Place(
        id = 58,
        cityId = 15,
        name = R.string.place_vladivostok_studio,
        category = Category.CAFE,
        description = R.string.place_vladivostok_studio_description,
        address = R.string.place_vladivostok_studio_address,
        workTime = R.string.place_vladivostok_studio_time,
        price = R.string.place_vladivostok_studio_price,
        imageRes = R.drawable.place_vladivostok_studio
    ),
    Place(
        id = 59,
        cityId = 15,
        name = R.string.place_vladivostok_teplo,
        category = Category.HOTEL,
        description = R.string.place_vladivostok_teplo_description,
        address = R.string.place_vladivostok_teplo_address,
        workTime = R.string.place_vladivostok_teplo_time,
        price = R.string.place_vladivostok_teplo_price,
        imageRes = R.drawable.place_vladivostok_teplo
    ),
    Place(
        id = 60,
        cityId = 15,
        name = R.string.place_vladivostok_mozgolomka,
        category = Category.ENTERTAINMENT,
        description = R.string.place_vladivostok_mozgolomka_description,
        address = R.string.place_vladivostok_mozgolomka_address,
        workTime = R.string.place_vladivostok_mozgolomka_time,
        price = R.string.place_vladivostok_mozgolomka_price,
        imageRes = R.drawable.place_vladivostok_mozgolomka
    ),


    // --- ХАБАРОВСК ---
    Place(
        id = 61,
        cityId = 16,
        name = R.string.place_khabarovsk_amur,
        category = Category.ATTRACTION,
        description = R.string.place_khabarovsk_amur_description,
        address = R.string.place_khabarovsk_amur_address,
        workTime = R.string.place_khabarovsk_amur_time,
        price = R.string.place_khabarovsk_amur_price,
        imageRes = R.drawable.place_khabarovsk_amur
    ),
    Place(
        id = 62,
        cityId = 16,
        name = R.string.place_khabarovsk_restaurant_amur,
        category = Category.CAFE,
        description = R.string.place_khabarovsk_restaurant_amur_description,
        address = R.string.place_khabarovsk_restaurant_amur_address,
        workTime = R.string.place_khabarovsk_restaurant_amur_time,
        price = R.string.place_khabarovsk_restaurant_amur_price,
        imageRes = R.drawable.place_khabarovsk_restaurant_amur
    ),
    Place(
        id = 63,
        cityId = 16,
        name = R.string.place_khabarovsk_ruma,
        category = Category.HOTEL,
        description = R.string.place_khabarovsk_ruma_description,
        address = R.string.place_khabarovsk_ruma_address,
        workTime = R.string.place_khabarovsk_ruma_time,
        price = R.string.place_khabarovsk_ruma_price,
        imageRes = R.drawable.place_khabarovsk_ruma
    ),
    Place(
        id = 64,
        cityId = 16,
        name = R.string.place_khabarovsk_scaland,
        category = Category.ENTERTAINMENT,
        description = R.string.place_khabarovsk_scaland_description,
        address = R.string.place_khabarovsk_scaland_address,
        workTime = R.string.place_khabarovsk_scaland_time,
        price = R.string.place_khabarovsk_scaland_price,
        imageRes = R.drawable.place_khabarovsk_scaland
    )

)