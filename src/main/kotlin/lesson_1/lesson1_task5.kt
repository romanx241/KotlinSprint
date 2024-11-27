package org.example.lesson_1

fun main() {
    val secondsAll = 6480
    val secondHour = 3600
    val minuteHour = 60
    val hours = (secondsAll / secondHour)
    val secondRemains = (secondsAll - hours * secondHour)
    val minutes = (secondRemains / minuteHour)
    val seconds = (secondRemains - minutes * minuteHour)

    println("[" + "%02d:%02d:%02d".format(hours, minutes, seconds) + "]")

}


