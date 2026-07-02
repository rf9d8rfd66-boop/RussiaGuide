package com.example.russiaguide.data

import com.example.russiaguide.R
import com.example.russiaguide.model.City
import com.example.russiaguide.model.Region

val cities = listOf(

    City(
        id = 1,
        name = R.string.city_moscow,
        region = Region.CENTRAL,
        description = R.string.city_moscow_description,
        imageRes = R.drawable.city_moscow
    ),

    City(
        id = 2,
        name = R.string.city_yaroslavl,
        region = Region.CENTRAL,
        description = R.string.city_yaroslavl_description,
        imageRes = R.drawable.city_yaroslavl
    ),

    City(
        id = 3,
        name = R.string.city_saint_petersburg,
        region = Region.NORTHWEST,
        description = R.string.city_saint_petersburg_description,
        imageRes = R.drawable.city_saint_petersburg
    ),

    City(
        id = 4,
        name = R.string.city_kaliningrad,
        region = Region.NORTHWEST,
        description = R.string.city_kaliningrad_description,
        imageRes = R.drawable.city_kaliningrad
    ),

    City(
        id = 5,
        name = R.string.city_sochi,
        region = Region.SOUTH,
        description = R.string.city_sochi_description,
        imageRes = R.drawable.city_sochi
    ),

    City(
        id = 6,
        name = R.string.city_krasnodar,
        region = Region.SOUTH,
        description = R.string.city_krasnodar_description,
        imageRes = R.drawable.city_krasnodar
    ),

    City(
        id = 7,
        name = R.string.city_pyatigorsk,
        region = Region.NORTH_CAUCASUS,
        description = R.string.city_pyatigorsk_description,
        imageRes = R.drawable.city_pyatigorsk
    ),

    City(
        id = 8,
        name = R.string.city_kislovodsk,
        region = Region.NORTH_CAUCASUS,
        description = R.string.city_kislovodsk_description,
        imageRes = R.drawable.city_kislovodsk
    ),

    City(
        id = 9,
        name = R.string.city_kazan,
        region = Region.VOLGA,
        description = R.string.city_kazan_description,
        imageRes = R.drawable.city_kazan
    ),

    City(
        id = 10,
        name = R.string.city_nizhny_novgorod,
        region = Region.VOLGA,
        description = R.string.city_nizhny_novgorod_description,
        imageRes = R.drawable.city_nizhny_novgorod
    ),

    City(
        id = 11,
        name = R.string.city_ekaterinburg,
        region = Region.URAL,
        description = R.string.city_ekaterinburg_description,
        imageRes = R.drawable.city_ekaterinburg
    ),

    City(
        id = 12,
        name = R.string.city_tyumen,
        region = Region.URAL,
        description = R.string.city_tyumen_description,
        imageRes = R.drawable.city_tyumen
    ),

    City(
        id = 13,
        name = R.string.city_novosibirsk,
        region = Region.SIBERIA,
        description = R.string.city_novosibirsk_description,
        imageRes = R.drawable.city_novosibirsk
    ),

    City(
        id = 14,
        name = R.string.city_irkutsk,
        region = Region.SIBERIA,
        description = R.string.city_irkutsk_description,
        imageRes = R.drawable.city_irkutsk
    ),

    City(
        id = 15,
        name = R.string.city_vladivostok,
        region = Region.FAR_EAST,
        description = R.string.city_vladivostok_description,
        imageRes = R.drawable.city_vladivostok
    ),

    City(
        id = 16,
        name = R.string.city_khabarovsk,
        region = Region.FAR_EAST,
        description = R.string.city_khabarovsk_description,
        imageRes = R.drawable.city_khabarovsk
    )
)