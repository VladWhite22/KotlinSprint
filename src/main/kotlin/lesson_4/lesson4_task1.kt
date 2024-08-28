package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val numberOfBookedTablesToday = 13
    val numberOfBookedTablesTomorrow = 9
    val numberOfFreeTablesToday = NUMBER_OF_TABLES - numberOfBookedTablesToday
    val numberOfFreeTablesTomorrow = NUMBER_OF_TABLES - numberOfBookedTablesTomorrow

    println("Введите необходимое чило столов:")
    val BookTable = readln().toInt()

    println(
        "[Доступность столиков на сегодня:${BookTable < numberOfFreeTablesToday}]" +
                "\n[Доступность столиков на завтра:${BookTable <= numberOfFreeTablesTomorrow}]"
    )
}