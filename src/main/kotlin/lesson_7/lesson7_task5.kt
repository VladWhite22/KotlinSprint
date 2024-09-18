package org.example.lesson_7

fun main() {
    val numbers = 0..9
    val chars = 'a'..'z'
    val charsCaptal = 'A'..'Z'

    println("Введите количество символов в пароле:")
    var userCondition = readln().toInt()

    while (userCondition < 6) {
        println("Минимальная длинна пароля 6 символов" +
                    "Введите количество символов в пароле:")
        userCondition = readln().toInt()
        if (userCondition >= 6) break
    }
    var password = ""
    for (i in userCondition downTo 1) {
        val random = 1..3
        val r = random.random()
        when {r == 1 -> password += numbers.random()}
        when {r == 2 -> password += chars.random()}
        when {r == 3 -> password += charsCaptal.random()}
    }
    println(password)
    println(password.length)
}