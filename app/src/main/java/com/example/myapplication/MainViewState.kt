package com.example.myapplication

class MainViewState(val weatherList: List<Weather>) {
    val hasData: Boolean
    get() = weatherList.size != 0
    fun getBool() = weatherList.size != 0
}