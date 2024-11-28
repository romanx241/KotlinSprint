package org.example.lesson_2

fun main() {
    val checkOutTimeHour = 9
    val checkOutTimeMinute = 39
    val timeTravel = 457
    val timeTravelHour = timeTravel / 60
    val timeTravelMinute = timeTravel % 60
    val timeArrivalHour = checkOutTimeHour + timeTravelHour
    val timeArrivalMinute = (checkOutTimeMinute + timeTravelMinute)
    val timeArrivalH = timeArrivalMinute / 60
    val timeArrivalM = timeArrivalMinute % 60
    val trainArrivalH = timeArrivalHour+ timeArrivalH
    val trainArrivalM = timeTravelMinute + timeArrivalM

    println("Поезд прибудет в " + "$trainArrivalH" + " часов " + "$trainArrivalM " + "минуты")
}