package com.example.russiaguide.navigations

sealed class Screen(val route: String) {

    data object Home : Screen("home")

    data object Filter : Screen("filter")
    data object City : Screen("city/{cityId}") {
        fun createRoute(cityId: Int) = "city/$cityId"
    }

    data object Place : Screen("place/{placeId}") {
        fun createRoute(placeId: Int) = "place/$placeId"
    }
    data object FilterResult : Screen("filterResult/{region}/{city}/{category}") {
        fun createRoute(region: String, city: String, category: String): String {
            return "filterResult/$region/$city/$category"
        }
    }

}