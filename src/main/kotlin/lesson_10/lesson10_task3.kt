package org.example.lesson_10

fun main() {
    println("Введите длинну пароля:")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(passwordLength: Int): String {
    var password = ""
    val numbers = 0..9
    val spechalChars = ' '..'/'
    for (i in 1..passwordLength)
        if (i % 2 != 0) password += (numbers.random())
        else password += (spechalChars.random())
    return password
}
