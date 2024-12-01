package org.example.lesson_5

fun main() {

    print("Введите первое число: ")
    val num1 = readln()

    print("Введите второе число: ")
    val num2 = readln()
    println("Сумма двух чисел: ")
    var sum = num1 + num2
    sum = readln()

    println(": $num1")
    println(": $num2")
    println(": $sum")

    if (sum == num1 + num2) {
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен")
    }
}


