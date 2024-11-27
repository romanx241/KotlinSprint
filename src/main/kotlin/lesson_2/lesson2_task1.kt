package org.example.lesson_2


fun main() {
    val studentBall1 = 3
    val studentBall2 = 4
    val studentBall3 = 3
    val studentBall4 = 5
    val numbersStudent = 4
    val random = ((studentBall1 + studentBall2 + studentBall3 + studentBall4) / numbersStudent).toDouble()
    println("%.2f".format(random))
}