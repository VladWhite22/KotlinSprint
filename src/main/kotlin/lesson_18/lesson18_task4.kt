package org.example.lesson_18

fun main() {
    val packege1 = Parallelepipid(10, 55, 7)
    val packege2 = Cube(10)

    packege1.packagingArea()
    packege2.packagingArea()
}

open class Fiure() {
    open fun packagingArea() {}
}

class Parallelepipid(val length: Int, val width: Int, val height: Int) : Fiure() {
    override fun packagingArea() {
        println(2 * ((length * width) + (width * height) + (length * height)))
    }
}

class Cube(val length: Int) : Fiure() {
    override fun packagingArea() {
        println(6 * (length * length))
    }
}