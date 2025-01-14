package org.example.lesson_6

fun main() {
    val nmber1 = (1..9).random()
    val nmber2 = (1..9).random()

    var caunter = 0

    while (caunter != 3) {
        caunter++
        println("Чему равна сумма чисел $nmber1+$nmber2?")
        val capcha = readln().toInt()
        if (caunter == 3) {
            println("Истекло количество попыток")
        }
        if (capcha == nmber1 + nmber2) {
            println("Успех")
            break
        }
    }

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