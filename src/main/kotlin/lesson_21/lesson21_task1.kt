package org.example.lesson_21

fun main() {

    val text = "hello kotlin"
    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    val listOfGuestLetters = listOf('a', 'e', 'i', 'o', 'u')
//    var counter = 0
//
//        if (char in listOfGuestLetters)
//            counter++
    return this.count {it in this.contains(listOfGuestLetters)}
}

