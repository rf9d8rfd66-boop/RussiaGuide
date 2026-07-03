package com.example.russiaguide.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.russiaguide.model.City

@Composable
fun CityCard(
    city: City,
    onClick: (Int) -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { onClick(city.id) },
        shape = RoundedCornerShape(
            dimensionResource(R.dimen.corner_radius)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.padding_small)
        )
    ) {

        Column {

            Image(
                painter = painterResource(city.imageRes),
                contentDescription = stringResource(city.name),
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
                    text = stringResource(city.name),
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(
                    modifier = Modifier.height(
                        dimensionResource(R.dimen.padding_small)
                    )
                )

                Text(
                    text = stringResource(city.description),
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2
                )

            }

        }

    }

}