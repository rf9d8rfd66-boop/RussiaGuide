package com.example.russiaguide.navigation

sealed class Screen(val route: String) {

    data object Home : Screen("home")

    data object Filter : Screen("filter")

    data object City : Screen("city/{cityId}") {
        fun createRoute(cityId: Int) = "city/$cityId"
    }

    data object Place : Screen("place/{placeId}") {
        fun createRoute(placeId: Int) = "place/$placeId"
    }

}