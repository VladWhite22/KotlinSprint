package org.example.lesson_18

fun main() {
    val dot1 = Dot()
    val circle1 = Circle()
    val square1 = Square()

    dot1.draw(3.4f, 5.3f)
    circle1.draw(2.3f, 7.6f)
    square1.draw(8.4f, 2.9f)
}

abstract class Screen() {
    abstract fun draw(x: Float, y: Float)
}

class Dot : Screen() {
    override fun draw(x: Float, y: Float) {
        println("Точка x:$x y:$y ")
    }
}

class Circle : Screen() {
    override fun draw(x: Float, y: Float) {
        println("Круг x:$x y:$y")
    }
}

class Square : Screen() {
    override fun draw(x: Float, y: Float) {
        println("Квадрат x:$x y:$y")
    }
}

