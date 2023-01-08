package com.sebrahimi.weathersampleapp.api.dto

import com.google.gson.annotations.SerializedName

data class DailyForecastDTO(
    @SerializedName("cod") val statusCode: Int,
    @SerializedName("cnt") val count: Int,
    @SerializedName("list") val hourlyWeatherInfoList: List<HourlyWeatherInfoDTO>,
    val city: CityDTO
)
