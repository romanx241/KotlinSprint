package org.example.lesson_2

fun main() {
    val checkOutTimeHour = 9
    val checkOutTimeMinute = 39
    val timeTravel = 457
    val minuteInHour = 60
    val checkOutTimeHorInMinute = checkOutTimeHour * minuteInHour
    val checkOutTimeAllMinute = checkOutTimeHorInMinute + checkOutTimeMinute
    val trainArrivalAllMinute = checkOutTimeAllMinute + timeTravel
    val trainArrivalHour = trainArrivalAllMinute / minuteInHour
    val trainArrivalMinute = trainArrivalAllMinute % minuteInHour

    println("Поезд прибудет в " + "$trainArrivalHour" + " часов " + "$trainArrivalMinute " + "минуты")
}