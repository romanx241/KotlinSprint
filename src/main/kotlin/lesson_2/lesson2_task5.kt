package org.example.lesson_2
import kotlin.math.pow

fun main() {
    val amountDeposit = 70000
    val interestRate = 16.7
    val depositPeriod = 20
    val base = (1 + interestRate / 100)
    val result = base.pow(depositPeriod)
    val totalAmount = amountDeposit * result
    println("%.3f".format(totalAmount))
}