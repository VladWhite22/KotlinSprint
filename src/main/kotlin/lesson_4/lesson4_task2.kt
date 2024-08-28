package org.example.lesson_4

const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_CAPACITY = 100

fun main() {
    val weight = 50
    val capacity = 100

    println(
        "Груз с весом $weight кг и объемом $capacity л соответствует категории 'Average':" +
                "${AVERAGE_WEIGHT_MIN < weight && weight <= AVERAGE_WEIGHT_MAX && capacity < AVERAGE_CAPACITY}"
    )
}