package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


enum class WeatherType {
    SUNNY,
    RAINY,
    CLOUDY
}

class MainActivity : AppCompatActivity() {
    val weather = Weather()
    lateinit var button: Button
//    companion object {
//        private val EXTRA_WEATHER = MainActivity::class.java
//        fun getIntent(ctx: Context, weather: Weather): Intent{
//            val intent = Intent(ctx, MainActivity::class.java)
//            intent.putExtra(EXTRA_WEATHER, weather)
//            return intent
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Repository.getWeatherList()
        val noteED: EditText = findViewById(R.id.note_ed)
        val town = if (noteED != null) noteED.text else "no data"
        supportActionBar?.title = if (noteED != null) "title" else "title2"
        noteED.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        })
        noteED.setOnClickListener {
        }
        val w = Weather("Санкт-Петербург")
        setWeather("Москва", false, 16)

        val state = MainViewState(Repository.getWeatherList())
        val weatherList = state.weatherList
        for (weather in Repository.getWeatherList())
            print(weather)
        for (i in 0..10)
            print(i)
        for (i in 0 until Repository.getWeatherList().size)
            print(i)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) { /*do work*/
            }
        })
    }

    private val textChangeListener = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            TODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged(s: Editable?) {
            TODO("Not yet implemented")
        }

    }

    fun setWeather(town: String, isHomeTown: Boolean = true, temperature: Int = 15) {

    }

    var weatherList: List<Weather> = listOf()
    val color = when (weather.type) {
        WeatherType.CLOUDY -> Color.GRAY
        WeatherType.RAINY -> Color.BLUE
        WeatherType.SUNNY -> Color.RED

    }


}