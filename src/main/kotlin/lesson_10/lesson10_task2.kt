package org.example.lesson_10

const val PASSWORD_OR_LOGIN_LENGTH = 4

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if (checkLength(login, password)) println("Логин или пароль недостаточно длинные!")
    else println("Добро пожаловать!")
}

fun checkLength(login: String, password: String): Boolean =
    login.length < PASSWORD_OR_LOGIN_LENGTH || password.length < PASSWORD_OR_LOGIN_LENGTH



