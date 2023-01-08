package com.sebrahimi.weathersampleapp.api.dto

import com.google.gson.annotations.SerializedName

/**
 * representing "main" object in the API response
 */
data class WeatherMainDetailsDTO(
    @SerializedName("temp") val temperature: Double,
    @SerializedName("feels_like") val feelsLike: Double,
    @SerializedName("temp_min") val minTemperature: Double,
    @SerializedName("temp_max") val maxTemperature: Double,
    val pressure: Double,
    val humidity: Double,
)
