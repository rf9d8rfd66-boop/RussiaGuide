package com.example.russiaguide.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.russiaguide.R
import com.example.russiaguide.data.places

@Composable
fun PlaceScreen(
    placeId: Int
) {

    val place = places.firstOrNull { it.id == placeId } ?: return

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
                painter = painterResource(place.imageRes),
                contentDescription = stringResource(place.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.banner_height)),
                contentScale = ContentScale.Crop
            )

        }

        item {

            Text(
                text = stringResource(place.name),
                style = MaterialTheme.typography.headlineMedium
            )

        }

        item {

            Text(
                text = stringResource(place.description),
                style = MaterialTheme.typography.bodyLarge
            )

        }

        item {

            Text(
                text = "📍 Адрес",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = stringResource(place.address)
            )

        }

        item {

            Text(
                text = "🕒 Время работы",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = stringResource(place.workTime)
            )

        }

        item {

            Text(
                text = "💰 Стоимость",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = stringResource(place.price)
            )

        }

    }

}