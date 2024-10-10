package org.example.lesson_10

var counterHumanWin = 0

fun main() {
    conductingRound()

    do {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readln()

        if (answer == "Да") conductingRound()
        else println("Вы выграли:$counterHumanWin")
    } while (answer == "Да")
}

fun conductingRound() {
    val userTrow = throwDice()
    val computerTrow = throwDice()

    println("Кость бросил человек:$userTrow")
    println("Кость бросил компьютер:$computerTrow")

    when {
        userTrow > computerTrow -> println("Победило человечество!")
    }
    when {
        userTrow > computerTrow -> counterHumanWin++
    }
    when {
        userTrow == computerTrow -> println("Ничья")
    }
    when {
        userTrow < computerTrow -> println("Победила машина!")
    }
}

fun throwDice(range: IntRange = 1..6) = range.random()

