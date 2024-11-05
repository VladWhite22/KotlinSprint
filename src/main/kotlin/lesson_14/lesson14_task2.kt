package org.example.lesson_14

fun main() {
    val liner1 = Liner1()
    val icebreaker1 = Icebreaker1(5, 50, 20)
    val cargo1=Cargo1(8,1000,15,)

    liner1.diveInLiner1()
    liner1.printInformationLiner1()

    icebreaker1.diveInIcebreaker1()
    icebreaker1.printInformationIcrbreaker1()

    cargo1.diveInCargo1()
    cargo1.printInformationCargo1()
}

open class Liner1(
    val speed: Int = 10,
    val capacity: Int = 100,
    val numberOfPassengers: Int = 1000,
    val breakIce: Boolean = false, ) {
    fun diveInLiner1() { println("Выдвинуть горизонтальный трап со шкафута") }

    fun printInformationLiner1() {
        println("Скорость:$speed" +
                    "\nГрузоподьемность:$capacity" +
                    "\nЧисло пасажиров:$numberOfPassengers" +
                    "\nЛомание льда:$breakIce")
    }
}

class Icebreaker1(
    speed: Int,
    capacity: Int,
    numberOfPassengers: Int,
    breakIce: Boolean = true, ) : Liner1(speed, capacity, numberOfPassengers, breakIce) {
    fun diveInIcebreaker1() { println("Открыть ворота со стороны кормы") }
    fun printInformationIcrbreaker1() {
        println("Скорость:$speed" +
                    "\nГрузоподьемность:$capacity" +
                    "\nЧисло пасажиров:$numberOfPassengers" +
                    "\nЛомание льда:$breakIce")
    }
}

class Cargo1(
    speed: Int,
    capacity: Int,
    numberOfPassengers: Int,
    breakIce: Boolean = false, ) : Liner1(speed, capacity, numberOfPassengers, breakIce) {
    fun diveInCargo1() { println("Активировать погрузочный кран") }
    fun printInformationCargo1() { println("Скорость:$speed" +
                    "\nГрузоподьемность:$capacity" +
                    "\nЧисло пасажиров:$numberOfPassengers" +
                    "\nЛомание льда:$breakIce") }
}