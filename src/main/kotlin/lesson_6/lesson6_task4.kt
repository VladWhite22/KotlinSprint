package org.example.lesson_6

fun main() {
    var counter = 3
    val number = 7

    do {
        counter--
        println("Введите число от 1 до 9")
        val userNumber = readln().toInt()

        when {userNumber == number -> println("Это была великолепная игра!")
            else -> println("Ошибка, осталось $counter попыток") }

        when {counter == 0 && userNumber != number -> println("Было загадано число $number") }
    }
    while (number != userNumber && counter > 0)
}