package com.example.myapplication

object Repository {

    private var weatherList: List<Weather> = listOf(Weather("Тюмень", 25))

    fun getWeatherList(): List<Weather> {
        return weatherList
    }

}