package com.example.russiaguide.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.russiaguide.components.PlaceCard
import com.example.russiaguide.data.cities
import com.example.russiaguide.data.places
import com.example.russiaguide.model.Category
import com.example.russiaguide.R

@Composable
fun CityScreen(
    cityId: Int,
    onPlaceClick: (Int) -> Unit
) {

    val city = cities.firstOrNull { it.id == cityId } ?: return

    val cityPlaces = places.filter { it.cityId == cityId }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_medium)),
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.padding_medium)
        )
    ) {

        item {

            Image(
                painter = painterResource(city.imageRes),
                contentDescription = stringResource(city.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.banner_height)),
                contentScale = ContentScale.Crop
            )

        }

        item {

            Text(
                text = stringResource(city.name),
                style = MaterialTheme.typography.headlineMedium
            )

        }

        item {

            Text(
                text = stringResource(city.description),
                style = MaterialTheme.typography.bodyLarge
            )

        }

        categorySection(
            title = "🏛️ Достопримечательности",
            places = cityPlaces.filter {
                it.category == Category.ATTRACTION
            },
            onPlaceClick = onPlaceClick
        )

        categorySection(
            title = "☕ Кафе",
            places = cityPlaces.filter {
                it.category == Category.CAFE
            },
            onPlaceClick = onPlaceClick
        )

        categorySection(
            title = "🏨 Отели",
            places = cityPlaces.filter {
                it.category == Category.HOTEL
            },
            onPlaceClick = onPlaceClick
        )

        categorySection(
            title = "🎡 Развлечения",
            places = cityPlaces.filter {
                it.category == Category.ENTERTAINMENT
            },
            onPlaceClick = onPlaceClick
        )

    }

}




private fun androidx.compose.foundation.lazy.LazyListScope.categorySection(
    title: String,
    places: List<com.example.russiaguide.model.Place>,
    onPlaceClick: (Int) -> Unit
) {

    if (places.isNotEmpty()) {

        item {

            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge
            )

        }

        items(places) { place ->

            PlaceCard(
                place = place,
                onClick = onPlaceClick
            )

        }

    }

}