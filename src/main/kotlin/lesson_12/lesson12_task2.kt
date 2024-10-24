package org.example.lesson_12

fun main() {
    val day1 = Wether(20, 10, true)
    day1.printWD()
}

class Wether(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRaining: Boolean,
) {
    fun printWD() {
        println(
            "Дневная температура:$dayTemperature" +
                    "\nНочная температура:$nightTemperature" +
                    "\nНаличие дождя:\n$isRaining"
        )
    }
}