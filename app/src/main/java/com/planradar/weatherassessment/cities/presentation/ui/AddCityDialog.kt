package com.planradar.weatherassessment.cities.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.planradar.weatherassessment.R
import com.planradar.weatherassessment.theme.WeatherAppAssessmentTheme

@Composable
fun AddCityDialog(
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit,
    isLoading: Boolean,
    error: String?
) {
    var cityName by remember { mutableStateOf("") }
    val showError = error != null

    LaunchedEffect(error) {
        if (error == null && !isLoading) {
            cityName = ""
        }
    }

    AlertDialog(
        onDismissRequest = { 
            if (!isLoading) {
                cityName = ""
                onDismiss()
            }
        },
        title = {
            Text(
                stringResource(R.string.add_city_dialog_title),
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp
                )
            )
        },
        text = {
            Column {
                OutlinedTextField(
                    value = cityName,
                    onValueChange = { cityName = it },
                    label = { 
                        Text(
                            stringResource(R.string.city_name_label),
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontSize = 14.sp
                            )
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !isLoading,
                    singleLine = true,
                    isError = showError
                )
                if (showError) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = error ?: "",
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        },
        confirmButton = {
            Button(
                onClick = { 
                    val name = cityName.trim()
                    onConfirm(name)
                },
                enabled = !isLoading && cityName.isNotBlank()
            ) {
                if (isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(16.dp),
                        color = Color.White,
                        strokeWidth = 2.dp
                    )
                } else {
                    Text(
                        stringResource(R.string.add),
                        style = MaterialTheme.typography.labelLarge.copy(
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp
                        )
                    )
                }
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    cityName = ""
                    onDismiss()
                },
                enabled = !isLoading
            ) {
                Text(
                    stringResource(R.string.cancel),
                    style = MaterialTheme.typography.labelLarge.copy(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AddCityDialogPreview() {
    WeatherAppAssessmentTheme {
        Dialog(onDismissRequest = {}) {
            AddCityDialog(
                onDismiss = {},
                onConfirm = {},
                isLoading = false,
                error = null
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddCityDialogErrorPreview() {
    WeatherAppAssessmentTheme {
        Dialog(onDismissRequest = {}) {
            AddCityDialog(
                onDismiss = {},
                onConfirm = {},
                isLoading = false,
                error = "City already added"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddCityDialogLoadingPreview() {
    WeatherAppAssessmentTheme {
        Dialog(onDismissRequest = {}) {
            AddCityDialog(
                onDismiss = {},
                onConfirm = {},
                isLoading = true,
                error = null
            )
        }
    }
}

