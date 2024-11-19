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
    open fun throwDice() {}
}

class FourSidedDice() : Dice() {
    override val number: Int = 4
    override fun throwDice() {
        return println((1..number).random())
    }
}

class SixSidedDice : Dice() {
    override val number: Int = 6
    override fun throwDice() {
        return println((1..number).random())
    }
}

class EightSidedDice : Dice() {
    override val number: Int = 8
    override fun throwDice() {
        return println((1..number).random())
    }
}