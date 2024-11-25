package org.example.lesson_1

import java.text.DecimalFormat
import java.text.NumberFormat

fun main() {
    // общее количество секунд, проведенных Гагариным в космосе
    val secondsAll = 6480
    // количество секунд в часе
    val secondHour = 3600
    // количество минут в часе
    val minuteHour = 60
    // количество целых часов
    val hours = (secondsAll / secondHour)
    // остаток в секундах
    val secondRemains = (secondsAll - hours * secondHour)
    // количество целых минут
    val minutes = (secondRemains / minuteHour)
    // количество целых секунд
    val seconds = (secondRemains - minutes * minuteHour)

    val f: NumberFormat = DecimalFormat("00")
    println("[" + "${f.format(hours)} : ${f.format(minutes)} : ${f.format(seconds)}" + "]")

}


