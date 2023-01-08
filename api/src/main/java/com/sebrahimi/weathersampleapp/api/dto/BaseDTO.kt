package com.sebrahimi.weathersampleapp.api.dto

interface BaseDTO<T, O> {
    fun mapToModel(dtoObject: T): O
}