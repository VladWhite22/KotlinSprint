package org.example.lesson_7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()
    val progression = 0..userNumber step 2
    for (n in progression) println(n)
}