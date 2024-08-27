package org.example.lesson_4

const val AVAILABILITY_OF_SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val AIR_HUMIDITY_IS_20 = 20
const val THE_CURRENT_SEASON_WINTER = "Зима"

fun main() {
    val weatherTodaySunny = true
    val awningAtTheMoment = true
    val airHumidity20 = 20
    val theCurrentSeasonIsWinter = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    weatherTodaySunny == AVAILABILITY_OF_SUNNY_WEATHER
                            && awningAtTheMoment == OPEN_AWNING
                            && airHumidity20 == AIR_HUMIDITY_IS_20
                            && theCurrentSeasonIsWinter != THE_CURRENT_SEASON_WINTER
                }"
    )
}
