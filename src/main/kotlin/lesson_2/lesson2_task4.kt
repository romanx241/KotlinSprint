package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2
    val buffCrystalOre = (crystalOre * buff).toInt()
    val buffIronOre = (ironOre * buff).toInt()
    println("Бонусное количество кристаллической руды составляет" + ":" + "$buffCrystalOre")
    println("Бонусное количество железной руды составляет" + ":" + "$buffIronOre")
}