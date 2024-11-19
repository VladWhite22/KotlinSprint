package org.example.lesson_18

fun main() {
    Screen().draw(2, 1)
    Screen().draw(2.5f, 2)
    Screen().draw(5, 7.7f)
}

class Screen() {
    fun draw(x: Int, y: Int) {
        println("Точка x:$x y:$y")
    }

    fun draw(x: Int, y: Float) {
        println("Круг x:$x y:$y ")
    }

    fun draw(x: Float, y: Int) {
        println("Квадрат x:$x y:$y")
    }
}