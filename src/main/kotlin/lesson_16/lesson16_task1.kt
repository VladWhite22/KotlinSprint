package org.example.lesson_16

fun main() {
    Dice().showNumber()
}

class Dice {
    private val diceNumber = (1..6).random()
    fun showNumber() {
        println(diceNumber)
    }
}