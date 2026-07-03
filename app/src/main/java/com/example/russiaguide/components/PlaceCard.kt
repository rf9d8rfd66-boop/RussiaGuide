package com.example.russiaguide.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.russiaguide.R
import com.example.russiaguide.model.Place

@Composable
fun PlaceCard(
    place: Place,
    onClick: (Int) -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { onClick(place.id) },
        shape = RoundedCornerShape(
            dimensionResource(R.dimen.corner_radius)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.padding_small)
        )
    ) {

        Column {

            Image(
                painter = painterResource(place.imageRes),
                contentDescription = stringResource(place.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.city_image_height)),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(
                    dimensionResource(R.dimen.padding_medium)
                )
            ) {

                Text(
                    text = stringResource(place.name),
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(R.dimen.padding_small)
                    )
                )

                Text(
                    text = stringResource(place.description),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2
                )

            }

        }

    }

}