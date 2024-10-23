package org.example.lesson_12

fun main() {
    val day1 = WetherDay()
    val day2 = WetherDay()

    day1.dayTemperature = 20
    day1.nightTemperature = 15
    day1.isRaining = true

    day2.dayTemperature = 30
    day2.nightTemperature = 20
    day2.isRaining = false

    day1.printWD()
    day2.printWD()
}

class WetherDay() {
    var dayTemperature = 0
    var nightTemperature = 0
    var isRaining = false

    fun printWD() {
        println(
            "Дневная температура:$dayTemperature" +
                    "\nНочная температура:$nightTemperature" +
                    "\nНаличие дождя:\n$isRaining"
        )
    }
}