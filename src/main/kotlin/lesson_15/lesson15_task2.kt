package org.example.lesson_15

fun main() {
    val temperature1 = Temperature(1, "Лето", 23, 19)
    val precipitationAmount1 = PrecipitationAmount(1, "Лето", 10, 0)

    WeatherServer().SendMassege(temperature1, precipitationAmount1)
}

class WeatherServer {
    fun SendMassege(temperature: Temperature, precipitationAmount: PrecipitationAmount) {
        var weatherList1 = mutableListOf<Temperature>()
        var weatherList2 = mutableListOf<PrecipitationAmount>()
        weatherList1.add(temperature)
        weatherList2.add(precipitationAmount)

        for (weater in weatherList1) {
            println("${weater.dayNumber} ${weater.season}" +
                    "\n${weater.dayTemperature} ${weater.nightTemperature}") }

        for (weater in weatherList2) {
            println("${weater.dayNumber} ${weater.season}" +
                    "\n${weater.dayAmount} ${weater.nightAmout}") }
    }
}

abstract class WeatherStationStats {
    abstract val dayNumber: Int
    abstract val season: String
}

class Temperature(
    override val dayNumber: Int,
    override val season: String,
    val dayTemperature: Int,
    val nightTemperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    override val dayNumber: Int,
    override val season: String,
    val dayAmount: Int,
    val nightAmout: Int,
) : WeatherStationStats()
