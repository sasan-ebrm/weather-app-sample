package com.sebrahimi.weathersampleapp.api.dto

import com.google.gson.annotations.SerializedName

data class CloudDTO(
    @SerializedName("all") val amount: Double
)
