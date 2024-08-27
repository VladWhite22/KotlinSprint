package org.example.lesson_4

const val CONDITION_BODY_DAMAGE: Boolean = false
const val CONDITION_SECOND_BODY_DAMAGE: Boolean = true
val conditionNumberOfCrew = 55..70
const val CONDITION_SECOND_NUMBER_Of_CREW = 70
const val CONDITION_NUMBER_BOXES_PROVISIONS: Int = 50
const val CONDITION_WEATHER_CONDITION: Boolean = true

fun main() {

    val bodyDamage: Boolean = true
    val numberOfCrew: Int = 70
    val numberBoxesProvisions: Int = 55
    val weatherCondition: Boolean = true

    val result: Boolean =
        ((bodyDamage == CONDITION_BODY_DAMAGE) &&
                (numberOfCrew in conditionNumberOfCrew) &&
                (numberBoxesProvisions >= CONDITION_NUMBER_BOXES_PROVISIONS)) ||
                ((bodyDamage == CONDITION_SECOND_BODY_DAMAGE) &&
                        (numberOfCrew == CONDITION_SECOND_NUMBER_Of_CREW) &&
                        (weatherCondition == CONDITION_WEATHER_CONDITION) &&
                        (numberBoxesProvisions >= CONDITION_NUMBER_BOXES_PROVISIONS))
    println(result)
}