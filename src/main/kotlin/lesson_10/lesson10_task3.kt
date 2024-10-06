package org.example.lesson_10

fun main() {
    println("Введите длинну пароля:")
    val passwordLength = readln().toInt()
    println(passwordGeneration(passwordLength))
}

fun passwordGeneration(passwordLength: Int): String {
    var password = ""
    val numbers = 0..9
    val spechalChars = charArrayOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    var caunter = 0
    for (i in 1..passwordLength) {
        caunter++
        if (caunter % 2 == 1) password += (numbers.random())
        else password += (spechalChars.random())
    }
    return password
}