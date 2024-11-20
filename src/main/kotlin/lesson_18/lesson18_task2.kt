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
        return println((1..number).random())}
}

class FourSidedDice() : Dice() {
    override val number: Int = 4
    override fun throwDice() {
        super.throwDice()
    }
}

class SixSidedDice : Dice() {
    override val number: Int = 6
    override fun throwDice() {
        super.throwDice()
    }
}

class EightSidedDice : Dice() {
    override val number: Int = 8
    override fun throwDice() {
        super.throwDice()
    }
}