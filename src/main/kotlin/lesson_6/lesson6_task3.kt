package org.example.lesson_6

fun main() {
    println("Введите кол-во секунд:")
    var time = readln().toInt()
    while (time > 0) {
        time--
        Thread.sleep(1000)
        println("Осталось секунд $time")
    }
    println("Время вышло")
}