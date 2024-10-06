package org.example.lesson_10

fun main() {
    val userTrow = throwDice()
    val computerTrow = throwDice()

    println("Кость бросил человек:$userTrow")
    println("Кость бросил компьютер:$computerTrow")

    if (userTrow > computerTrow) println("Победило человечество!")
    else if (userTrow == computerTrow) println("Ничья")
    else println("Победила машина!")
}

fun throwDice(range: IntRange = 1..6) = range.random()
