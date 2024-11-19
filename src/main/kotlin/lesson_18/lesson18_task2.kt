package org.example.lesson_18

fun main() {
    val fourSidedDice = FourSidedDice()
    val sixSidedDice = SixSidedDice()
    val eightSidedDice = EightSidedDice()

    val arrayOfDice = arrayOf<Dice>(fourSidedDice, sixSidedDice, eightSidedDice)
    for (element in arrayOfDice) {
        element.throwDice()
    }
}

open class Dice {
    open fun throwDice() {}
}

class FourSidedDice() : Dice() {
    override fun throwDice() {
        return println((1..4).random())
    }
}

class SixSidedDice : Dice() {
    override fun throwDice() {
        return println((1..6).random())
    }
}

class EightSidedDice : Dice() {
    override fun throwDice() {
        return println((1..8).random())
    }
}