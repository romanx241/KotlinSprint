package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val buffCrystalOre = (crystalOre * buff / 100).toInt()
    val buffIronOre = (ironOre * buff / 100).toInt()
    println("Бонусное количество кристаллической руды составляет" + ":" + "$buffCrystalOre")
    println("Бонусное количество железной руды составляет" + ":" + "$buffIronOre")
}