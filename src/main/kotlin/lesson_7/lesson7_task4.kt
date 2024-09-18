package org.example.lesson_7

fun main() {
    println("Введите количество секунд:")
    val userSeconds = readln().toInt()

    for (s in userSeconds downTo 0) {
        Thread.sleep(1000)
        println("Осталось секунд:$s")
        when {s == 0 -> println("Время вышло!") }
    }
}