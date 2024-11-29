package org.example.lesson_5

fun main() {
    val indexLimit1 = 18.5
    val indexLimit2 = 25
    val indexLimit3 = 30

    println("Для расчета индекса массы тела введите данные своего веса в кг и роста в см")
    println("Ваш вес: ")
    val weight: Double = readln().toDouble()
    print("Ваш рост: ")
    val height: Double = readln().toDouble()
    val cmMetre = 100

    val heightMetre = height / cmMetre
    val indexBody = weight / (heightMetre * 2)

    if (indexBody < indexLimit1) {
        println("Недостаточная масса тела")
    } else if (indexBody >= indexLimit1 && indexBody < indexLimit2) {
        println("Нормальная масса тела")
    } else if (indexBody >= indexLimit2 && indexBody < indexLimit3) {
        println("Избыточная масса тела")
    } else if (indexBody >= indexLimit3)
        println("Ожирение")
    else {
    println("Вы не ввели данные")
    }
    println("Ваш индекс массы тела составляет " + String.format("%.2f", indexBody))

}