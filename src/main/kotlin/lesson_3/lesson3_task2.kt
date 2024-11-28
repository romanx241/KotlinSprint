package org.example.lesson_3

fun main() {
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var lastName = "Андреева"
    var age = 20
    println("[" + "$firstName $patronymic $lastName, $age" + "]")
    lastName = "Сидорова"
    age = 22
    println("[" + "$firstName $patronymic $lastName, $age" + "]")
}