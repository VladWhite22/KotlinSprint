package org.example.lesson_21

fun main() {
    val numbersList = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbersList.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var numberSum = 0
    for (number in this)
        if (number % 2 == 0) numberSum += number
    return numberSum
}