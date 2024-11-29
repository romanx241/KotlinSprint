package org.example.lesson_4

fun main() {
    val category: String = "'Average'"
    var weight: Int = 20
    var volume: Int = 80


    val resultAverage: Boolean = (weight > WEIGHT_AVERAGE1 && weight <= WEIGHT_AVERAGE2) && (volume < VOLUME_AVERAGE)

    println("Груз с весом $weight кг и объемом $volume л соответствует категории $category : $resultAverage")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории $category : $resultAverage")

}

const val WEIGHT_AVERAGE1 = 35
const val WEIGHT_AVERAGE2 = 100
const val VOLUME_AVERAGE = 100




