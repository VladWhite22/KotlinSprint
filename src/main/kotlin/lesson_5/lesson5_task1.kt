package org.example.lesson_5

fun main() {
    val captcha = 10
    println("Решите пример 5+7")
    val ansver = readLine()?.toInt()
    if (ansver == captcha) println("Добро пожаловать!")
    else println("Доступ заперещен")
}