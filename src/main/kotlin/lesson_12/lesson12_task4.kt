package org.example.lesson_12

const val K_TO_C = 273

fun main(){
    val dayWether1 = WetherDay(310, 295, false)

}
class WetherDay(
    dayTemperatureK: Int,
    nightTemperatureK: Int,
    _isRaining: Boolean,

) {
    var dayTemperature = dayTemperatureK- K_TO_C
    var nightTemperature = nightTemperatureK - K_TO_C
    var isRaining = _isRaining
    init {
        println(
            "Дневная температура:$dayTemperature" +
                    "\nНочная температура:$nightTemperature" +
                    "\nНаличие дождя:\n$isRaining"
        )
    }
}