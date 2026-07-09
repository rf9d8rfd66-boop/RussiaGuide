package com.example.russiaguide.screens.filter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.russiaguide.R
import com.example.russiaguide.components.PlaceCard
import com.example.russiaguide.data.cities
import com.example.russiaguide.data.places
import com.example.russiaguide.model.Category
import com.example.russiaguide.model.Region

@Composable
fun FilterResultScreen(
    navController: NavController,
    region: String,
    city: String,
    category: String
) {
    val filteredPlaces = places.filter { place ->
        var matches = true

        if (city != stringResource(R.string.all_cities)) {
            val cityId = cities.find { stringResource(it.name) == city }?.id
            matches = matches && place.cityId == cityId
        }

        if (category != stringResource(R.string.all_types)) {
            val categoryEnum = Category.values().find {
                stringResource(it.titleRes) == category
            }
            matches = matches && place.category == categoryEnum
        }

        if (region != stringResource(R.string.all_regions)) {
            val regionEnum = Region.values().find {
                stringResource(it.titleRes) == region
            }
            val cityInRegion = cities.any {
                it.region == regionEnum && it.id == place.cityId
            }
            matches = matches && cityInRegion
        }
        matches
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
        .padding(dimensionResource(R.dimen.padding_medium)),
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.padding_medium)
        )
    ) {

        item {
            Text(
                text = stringResource(R.string.filter_result),
                style = MaterialTheme.typography.headlineMedium
            )
        }

        item {
            Text(
                text = stringResource(R.string.places_found, filteredPlaces.size),
                style = MaterialTheme.typography.bodyLarge
            )
        }

        if (filteredPlaces.isEmpty()) {
            item {
                Text(
                    text = stringResource(R.string.nothing_found),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        } else {
            items(filteredPlaces) { place ->
                PlaceCard(
                    place = place,
                    onClick = { placeId ->
                        navController.navigate(
                            "place/$placeId"
                        )
                    }
                )
            }

        }
    }
}