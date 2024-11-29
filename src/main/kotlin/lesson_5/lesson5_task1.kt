package org.example.lesson_5

fun main() {

    print("Введите первое число: ")
    val num1 = readLine()
    print("Введите второе число: ")
    val num2 = readLine()
    println("Сумма двух чисел: ")
    var sum = num1 + num2
    sum = readLine().toString()

    println(": $num1")
    println(": $num2")
    println(": $sum")

    if (sum == num1 + num2) {
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен")
    }
}


