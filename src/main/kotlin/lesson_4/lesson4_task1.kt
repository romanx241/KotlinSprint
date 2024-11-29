package org.example.lesson_4

fun main() {
    val tableToday: Int = 13
    val tableTomorrow: Int = 9
    var tableReserve: Boolean = tableToday < QUANTITY_TABLE

    println("[" + "Доступность столиков на сегодня" + ":" + "$tableReserve" + "]")

    tableReserve = tableTomorrow <= QUANTITY_TABLE

    println("[" + "Доступность столиков на завтра" + ":" + "$tableReserve" + "]")
}
    const val QUANTITY_TABLE = 13