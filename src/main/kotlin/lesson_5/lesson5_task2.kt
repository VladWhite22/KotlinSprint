package org.example.lesson_5

const val AGE = 18

fun main() {
    val currentYear = 2024

    println("Введите год рождения:")
    val birthYear = readln().toInt()

    if (currentYear - birthYear > AGE)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ ограничен")
}