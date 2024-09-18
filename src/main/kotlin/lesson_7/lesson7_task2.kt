package org.example.lesson_7

fun main() {
    val numbers = 1000..9999
    val code = numbers.random()

    println("Ваш код авторизации $code")
    println("Введите ваш код авторизации")

    val userNumber = readln().toInt()

    if (userNumber == code) println("Добро пожаловать!")

    while (userNumber != code) {
        val newCode = numbers.random()
        println(
            "Вы ввели неправильный код " +
                    "Ваш новый код $newCode "
        )
        println("Введите ваш код авторизации")
        val userNumber = readln().toInt()

        if (userNumber == newCode) {
            println("Добро пожаловать!")
            break
        }
    }
}