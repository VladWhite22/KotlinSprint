package org.example.lesson_5

fun main() {
    val number1 = 5
    val number2 = 7

    println("Решите пример $number1+$number2")

    val ansver = readln().toInt()
    if (ansver == number1 + number2)
        println("Добро пожаловать!")
    else
        println("Доступ заперещен")
}