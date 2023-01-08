package com.sebrahimi.weathersampleapp.api.dto

import com.google.gson.annotations.SerializedName

data class HourlyWeatherInfoDTO(
    @SerializedName("dt") val timestamp: Long,
    @SerializedName("main") val mainInfo: WeatherMainDetailsDTO,
    @SerializedName("weather") val weatherInfoList: List<WeatherItemDTO>?,
    val wind: WindDTO?,
    val rain: RainDTO?,
    @SerializedName("dt_txt") val dateTimeString: String?
)
