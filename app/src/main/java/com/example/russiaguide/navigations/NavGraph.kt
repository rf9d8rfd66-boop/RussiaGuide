package com.example.russiaguide.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.russiaguide.screens.CityScreen
import com.example.russiaguide.screens.FilterScreen
import com.example.russiaguide.screens.HomeScreen
import com.example.russiaguide.screens.PlaceScreen
@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(Screen.Home.route) {

            HomeScreen(
                onFilterClick = {
                    navController.navigate(Screen.Filter.route)
                },
                onCityClick = { cityId ->
                    navController.navigate(
                        Screen.City.createRoute(cityId)
                    )
                }
            )

        }

        composable(Screen.Filter.route) {
            FilterScreen()
        }

        composable(Screen.City.route) { backStackEntry ->

            val cityId =
                backStackEntry.arguments?.getString("cityId")?.toIntOrNull() ?: 0

            CityScreen(
                cityId = cityId,
                onPlaceClick = { placeId ->
                    navController.navigate(
                        Screen.Place.createRoute(placeId)
                    )
                }
            )

        }

        composable(Screen.Place.route) { backStackEntry ->

            val placeId =
                backStackEntry.arguments?.getString("placeId")?.toIntOrNull() ?: 0

            PlaceScreen(
                placeId = placeId
            )

        }

    }

}