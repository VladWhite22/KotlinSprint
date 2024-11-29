package org.example.lesson_21

fun main() {
    val text = "hello kotlin"
    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    val listOfGuestLetters = listOf('a', 'e', 'i', 'o', 'u')
    return this.count { listOfGuestLetters.contains(it) }
}

