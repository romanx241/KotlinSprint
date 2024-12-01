package org.example.lesson_5


fun main() {

    println("Для расчета стоимости топлива для поездки введите следующие данные")
    println("Расстояние поездки в км: ")
    val distance: Double = readln().toDouble()
    print("Расход топлива на 100 км в литрах: ")
    val expenses: Double = readln().toDouble()
    print("Текущая цена за литр бензина: ")
    val price: Double = readln().toDouble()

    val fuelAll = (distance * expenses) / 100
    val priceAll = fuelAll * price

    println("Для вашей поездки необходимо $fuelAll литров топлива, которое обойдется в $priceAll рублей")

    }


