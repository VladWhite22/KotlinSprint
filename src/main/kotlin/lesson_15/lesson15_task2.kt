package org.example.lesson_15

fun main() {
    val temperature1 = Temperature(1, "Лето", 23, 19)
    val temperature2 = Temperature(2,"Лето",25,20)
    val precipitationAmount1 = PrecipitationAmount(1, "Лето", 10, 0)

    WeatherServer().SendMassege(temperature1)
    WeatherServer().SendMassege(temperature2)
    WeatherServer().SendMassege(precipitationAmount1)
}

class WeatherServer {
    fun SendMassege(parametr: WeatherStationStats) {
        var weatherList = mutableListOf<WeatherStationStats>()

        weatherList.add(parametr)
        for (wether in weatherList) {
            if (wether is Temperature) {
                println(
                    "${wether.dayNumber} ${wether.season} " +
                            "\n${wether.dayTemperature} ${wether.nightTemperature}"
                )
            }
        }

        for (wether in weatherList) {
            if (wether is PrecipitationAmount) {
                println(
                    "${wether.dayNumber} ${wether.season} " +
                            "\n${wether.dayAmount} ${wether.nightAmout}"
                )
            }
        }
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
