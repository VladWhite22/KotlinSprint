package org.example.lesson_6

fun main() {
    println("Введите кол-во секунд:")
    var time = readln().toLong()
    val timeStart = time
        Thread.sleep(1000*time)

    println("Прошло $timeStart секунд")
}