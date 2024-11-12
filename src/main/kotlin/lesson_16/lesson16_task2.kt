package org.example.lesson_16

import kotlin.math.pow

fun main() {
    val circle1 = Circle(7)
    println(
        "${circle1.calculateLength()}" +
                "\n${circle1.calculateArea()}"
    )
}

class Circle(private val radius: Int) {
    private val pi = 3.14
    fun calculateLength(): Double {
        return 2 * pi * radius
    }

    fun calculateArea(): Double {
        return (pi * radius).pow(2)
    }
}