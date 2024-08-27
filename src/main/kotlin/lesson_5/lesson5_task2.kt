package org.example.lesson_5

const val AGE = 18

fun main() {
    val currentYear = 2024
    val birthYear = 1997
    if (currentYear - birthYear > AGE) println("Показать экран со скрытым контентом")
    else println("Доступ ограничен")
}