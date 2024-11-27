package org.example.lesson_21

fun main() {
    val text = "hello kotlin"
    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    val listOfGuestLetters = listOf('a', 'e', 'i', 'o', 'u')
    var caunter = 0
    for (char in this)
        if (char in listOfGuestLetters)
            caunter++
    return caunter
}

