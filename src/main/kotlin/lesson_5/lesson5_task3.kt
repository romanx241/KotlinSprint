package org.example.lesson_5

fun main() {
    val oneLuckyNumber: Int = 15
    val twoLuckyNumber: Int = 25

    println("Для получения выигрыша вам следует ввести в консоль два числа из диапазона от 0 до 42")
    println("Введите первое число: ")
    val oneNumber: Int = readln().toInt()
    print("Введите второе число: ")
    val twoNumber: Int = readln().toInt()

    if ((oneNumber == oneLuckyNumber) && (twoNumber == twoLuckyNumber)) {
    println("Поздравляем! Вы выиграли главный приз!")
    } else if ((oneNumber == oneLuckyNumber) || (twoNumber == twoLuckyNumber)) {
            println("Вы выиграли утешительный приз!")
        } else {
            ((oneNumber != oneLuckyNumber) || (twoNumber != twoLuckyNumber))
            println("Неудача! Попробуйте еще раз!")
            println("Счастливыми номерами в этот раз были $oneLuckyNumber и $twoLuckyNumber")
        }
    }