package org.example.lesson_14

fun main() {
    val liner1 = Liner()
    val icebreaker1 = Icebreaker(5,50,20)
    val cargo1 = Cargo(8,1000,15,false)
}

open class Liner(
    val speed: Int = 10,
    val capacity: Int = 100,
    val numberOfPassengers: Int = 1000,
    val breakIce: Boolean = false,
)

class Icebreaker(
    speed: Int,
    capacity: Int,
    numberOfPassengers: Int,
    breakIce: Boolean = true,
) : Liner(speed, capacity, numberOfPassengers, breakIce)

class Cargo(
    speed: Int,
    capacity: Int,
    numberOfPassengers: Int,
    breakIce: Boolean,
) : Liner(speed, capacity, numberOfPassengers, breakIce)