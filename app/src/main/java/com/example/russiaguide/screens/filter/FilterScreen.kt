package com.example.russiaguide.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.russiaguide.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterScreen() {

    val regions = listOf("Выберите регион")
    val cities = listOf("Выберите город")
    val categories = listOf("Выберите тип места")

    var selectedRegion by remember { mutableStateOf(regions[0]) }
    var selectedCity by remember { mutableStateOf(cities[0]) }
    var selectedCategory by remember { mutableStateOf(categories[0]) }

    var regionExpanded by remember { mutableStateOf(false) }
    var cityExpanded by remember { mutableStateOf(false) }
    var categoryExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_medium)),
        verticalArrangement = Arrangement.spacedBy(
            dimensionResource(R.dimen.padding_medium)
        )
    ) {

        Text(
            text = stringResource(R.string.filter),
            style = MaterialTheme.typography.headlineMedium
        )

        // Регион

        ExposedDropdownMenuBox(
            expanded = regionExpanded,
            onExpandedChange = {
                regionExpanded = !regionExpanded
            }
        ) {

            OutlinedTextField(
                value = selectedRegion,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier
                    .menuAnchor(MenuAnchorType.PrimaryNotEditable)
                    .fillMaxWidth(),
                label = {
                    Text(stringResource(R.string.region))
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = regionExpanded
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = regionExpanded,
                onDismissRequest = {
                    regionExpanded = false
                }
            ) {

                regions.forEach {

                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            selectedRegion = it
                            regionExpanded = false
                        }
                    )

                }

            }

        }

        // Город

        ExposedDropdownMenuBox(
            expanded = cityExpanded,
            onExpandedChange = {
                cityExpanded = !cityExpanded
            }
        ) {

            OutlinedTextField(
                value = selectedCity,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier
                    .menuAnchor(MenuAnchorType.PrimaryNotEditable)
                    .fillMaxWidth(),
                label = {
                    Text(stringResource(R.string.city))
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = cityExpanded
                    )
                }
            )


            ExposedDropdownMenu(
                expanded = cityExpanded,
                onDismissRequest = {
                    cityExpanded = false
                }
            ) {

                cities.forEach {

                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            selectedCity = it
                            cityExpanded = false
                        }
                    )

                }

            }

        }

        // Тип места

        ExposedDropdownMenuBox(
            expanded = categoryExpanded,
            onExpandedChange = {
                categoryExpanded = !categoryExpanded
            }
        ) {

            OutlinedTextField(
                value = selectedCategory,
                onValueChange = {},
                readOnly = true,
                modifier = Modifier
                    .menuAnchor(MenuAnchorType.PrimaryNotEditable)
                    .fillMaxWidth(),
                label = {
                    Text(stringResource(R.string.place_type))
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(
                        expanded = categoryExpanded
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = categoryExpanded,
                onDismissRequest = {
                    categoryExpanded = false
                }
            ) {

                categories.forEach {

                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            selectedCategory = it
                            categoryExpanded = false
                        }
                    )

                }

            }

        }

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(stringResource(R.string.show))

        }

    }

}