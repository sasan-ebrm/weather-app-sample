package com.sebrahimi.weathersampleapp.api.dto

import com.google.gson.annotations.SerializedName

data class RainDTO(
    @SerializedName("3h") val amount: Double
)
