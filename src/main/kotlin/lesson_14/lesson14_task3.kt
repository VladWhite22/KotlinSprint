package org.example.lesson_14

import kotlin.math.pow

fun main() {
    val circle1 = Сircle("черный", 5)
    val circle2 = Сircle("черный", 7)
    val rectangle1 = Rectangle("белый", 4, 3)
    val rectangle2 = Rectangle("черный", 2, 2)

    var listOfFigures = mutableListOf(circle1, circle2, rectangle1, rectangle2)

    var sumOfPerimetrs = 0.0
    for (figure in listOfFigures) {
        if (figure.calor == "черный") {
            sumOfPerimetrs += figure.calculatePerimeter()
        }
    }
    println(sumOfPerimetrs)

    var sumOfAreas = 0.0
    for (figure in listOfFigures) {
        if (figure.calor == "белый") {
            sumOfAreas += figure.calculatePerimeter()
        }
    }
    println(sumOfAreas)
}

abstract class Figure(val calor: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Сircle(calor: String, val radius: Int) : Figure(calor) {

    override fun calculateArea(): Double {
        return kotlin.math.PI * radius.toDouble().pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * kotlin.math.PI * radius
    }
}

class Rectangle(calor: String, val width: Int, val height: Int) : Figure(calor) {
    override fun calculateArea(): Double {
        return width * height.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return width * 2 + height * 2.toDouble()
    }
}