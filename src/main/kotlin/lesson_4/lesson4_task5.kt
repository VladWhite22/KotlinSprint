package org.example.lesson_4

fun main() {
    val bodyDamage: Boolean = true
    val numberOfCrew: Int = 70
    val numberBoxesProvisions: Int = 55
    val weatherCondition: Boolean = true

    val conditionBodyDamage: Boolean = false
    val conditionSecondBodyDamage: Boolean = true
    val conditionNumberOfCrew = 55..70
    val conditionSecondNumberOfCrew = 70
    val conditionNumberBoxesProvisions: Int = 50
    val conditionWeatherCondition: Boolean = true

    val result: Boolean =
        ((bodyDamage == conditionBodyDamage) && (numberOfCrew in conditionNumberOfCrew) && (numberBoxesProvisions >= conditionNumberBoxesProvisions)) ||
                ((bodyDamage == conditionSecondBodyDamage) && (numberOfCrew == conditionSecondNumberOfCrew) && (weatherCondition == conditionWeatherCondition) && (numberBoxesProvisions >= conditionNumberBoxesProvisions))
    println(result)
}