package org.example.lesson_4

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true
    val humidity: Int = 20
    val timeYear: String = "ЗИМА"

    val result: Boolean = (weather == WEATHER) && (tent == TENT) && (humidity == HUMIDITY) && (timeYear == TIME_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых?" + ":" + "$result")

}
const val WEATHER = true
const val TENT = true
const val HUMIDITY = 20
const val TIME_YEAR = "ЛЕТО"



