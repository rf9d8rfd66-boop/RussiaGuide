package com.example.russiaguide.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.russiaguide.R
import com.example.russiaguide.components.CityCard
import com.example.russiaguide.data.cities
import com.example.russiaguide.data.popularCities

@Composable
fun HomeScreen(
    onFilterClick: () -> Unit,
    onCityClick: (Int) -> Unit
) {

    var popularExpanded by remember { mutableStateOf(false) }
    var allExpanded by remember { mutableStateOf(false) }

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
                painter = painterResource(R.drawable.banner_home),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.banner_height)),
                contentScale = ContentScale.Crop
            )

        }

        item {

            Text(
                text = stringResource(R.string.home_title),
                style = MaterialTheme.typography.headlineMedium
            )

        }

        item {

            Card(
                modifier = Modifier.fillMaxWidth(),
                onClick = onFilterClick,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = dimensionResource(R.dimen.padding_small)
                )
            ) {

                Text(
                    text = stringResource(R.string.filter),
                    modifier = Modifier.padding(
                        dimensionResource(R.dimen.padding_medium)
                    )
                )

            }

        }

        item {

            Card(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    popularExpanded = !popularExpanded
                }
            ) {

                Text(
                    text = if (popularExpanded)
                        "⭐ ${stringResource(R.string.popular_cities)} ▲"
                    else
                        "⭐ ${stringResource(R.string.popular_cities)} ▼",
                    modifier = Modifier.padding(
                        dimensionResource(R.dimen.padding_medium)
                    )
                )

            }

        }

        if (popularExpanded) {

            items(popularCities) { city ->

                CityCard(
                    city = city,
                    onClick = onCityClick
                )

            }

        }

        item {

            Card(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    allExpanded = !allExpanded
                }
            ) {

                Text(
                    text = if (allExpanded)
                        "📍 ${stringResource(R.string.all_cities)} ▲"
                    else
                        "📍 ${stringResource(R.string.all_cities)} ▼",
                    modifier = Modifier.padding(


                        dimensionResource(R.dimen.padding_medium)
                    )
                )

            }

        }

        if (allExpanded) {

            items(cities) { city ->

                CityCard(
                    city = city,
                    onClick = onCityClick
                )

            }

        }

    }

}