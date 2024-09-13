package org.example.lesson_7

fun main() {
    val numbers = 0..9
    val chars = 'a'..'z'

    val numb1 = numbers.random()
    val numb2 = numbers.random()
    val numb3 = numbers.random()
    val char1 = chars.random()
    val char2 = chars.random()
    val char3 = chars.random()

    println("$numb1$char1$numb2$char2$numb3$char3")
}