package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val numberOfBookedTablesToday = 13
    val numberOfBookedTablesTomorrow = 9
    val numberOfFreeTablesToday = NUMBER_OF_TABLES - numberOfBookedTablesToday
    val numberOfFreeTablesTomorrow = NUMBER_OF_TABLES - numberOfBookedTablesTomorrow
    val BookTable = 0
    println(
        "[Доступность столиков на сегодня:${BookTable < numberOfFreeTablesToday}]" +
                "\n[Доступность столиков на завтра:${BookTable <= numberOfFreeTablesTomorrow}]"
    )
}