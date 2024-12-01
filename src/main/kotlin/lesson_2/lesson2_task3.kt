package org.example.lesson_2

fun main() {
    val checkOutTimeHour = 9
    val checkOutTimeMinute = 39
    val timeTravel = 457

    val checkOutTimeHorInMinute = checkOutTimeHour * MINUTE_IN_HOUR
    val checkOutTimeAllMinute = checkOutTimeHorInMinute + checkOutTimeMinute
    val trainArrivalAllMinute = checkOutTimeAllMinute + timeTravel
    val trainArrivalHour = trainArrivalAllMinute / MINUTE_IN_HOUR
    val trainArrivalMinute = trainArrivalAllMinute % MINUTE_IN_HOUR

    println("Поезд прибудет в " + "$trainArrivalHour" + " часов " + "$trainArrivalMinute " + "минуты")
}
const val MINUTE_IN_HOUR = 60