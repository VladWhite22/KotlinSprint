package org.example.lesson_10

var counterHumanWin = 0

fun main() {
    conductingRound()

    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readln()

        if (answer.equals("Да", ignoreCase = true)) conductingRound()
        else println("Вы выграли:$counterHumanWin")
    } while (answer.equals("Да", ignoreCase = true))
}

fun conductingRound() {
    val userTrow = throwDice()
    val computerTrow = throwDice()

    println("Кость бросил человек:$userTrow")
    println("Кость бросил компьютер:$computerTrow")

    when {
        userTrow > computerTrow -> {
            println("Победило человечество!"); counterHumanWin++
        }

        userTrow == computerTrow -> println("Ничья")
        else -> println("Победила машина!")
    }
}

fun throwDice(range: IntRange = 1..6) = range.random()

