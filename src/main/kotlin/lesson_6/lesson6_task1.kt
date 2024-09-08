package org.example.lesson_6

fun main() {
    println("Введите новый логин:")
    val newLogin = readln()
    println("Введите новый пароль:")
    val newPassword = readln()

    do {
        println("Введите логин:")
        val login = readln()
        println("Введите  пароль:")
        val password = readln()
    } while (login != newLogin || password != newPassword)
    println("Авторизация прошла успешно")
}