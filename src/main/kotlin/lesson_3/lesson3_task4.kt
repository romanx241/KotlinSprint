package org.example.lesson_3

fun main() {
    var chessMoveFromWhere: String = "E2"
    var chessMoveWhere: String = "E4"
    var numberMove: Int = 1

    println("Первый ход белых" + ":" + "[" + "$chessMoveFromWhere" + "-" + "$chessMoveWhere" + ";" + " $numberMove" + "]")

    chessMoveFromWhere = "D2"
    chessMoveWhere = "D4"
    numberMove = 2

    println("Второй ход белых" + ":" + "[" + "$chessMoveFromWhere" + "-" + "$chessMoveWhere" + ";" + " $numberMove" + "]")

}