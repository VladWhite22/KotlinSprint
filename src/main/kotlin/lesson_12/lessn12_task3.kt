package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273

fun main(){
val dayWether1 = DayWether(310, 295, false)

    dayWether1.printWD()
}
class DayWether(
     dayTemperatureK: Int,
     nightTemperatureK: Int,
     _isRaining: Boolean,
) {
    var dayTemperature = dayTemperatureK- KELVIN_TO_CELSIUS
    var nightTemperature = nightTemperatureK - KELVIN_TO_CELSIUS
    var isRaining = _isRaining
    fun printWD() {
        println(
            "Дневная температура:$dayTemperature" +
                    "\nНочная температура:$nightTemperature" +
                    "\nНаличие дождя:\n$isRaining"
        )
    }
}