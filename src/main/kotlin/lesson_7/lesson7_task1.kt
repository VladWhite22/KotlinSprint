package org.example.lesson_7

fun main() {
    val numbers = 0..9
    val chars = 'a'..'z'

    var password: String = ""

    for (i in 1..6)
        if (i % 2 == 0) password += numbers.random()
        else password += chars.random()

    println(password)
}