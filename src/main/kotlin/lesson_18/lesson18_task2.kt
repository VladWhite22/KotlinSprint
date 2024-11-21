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

abstract class Dice {
    abstract val number: Int
    open fun throwDice() {
        return println((1..number).random())
    }
}

class FourSidedDice() : Dice() {
    override val number: Int = 4
}

class SixSidedDice : Dice() {
    override val number: Int = 6
}

class EightSidedDice : Dice() {
    override val number: Int = 8
}