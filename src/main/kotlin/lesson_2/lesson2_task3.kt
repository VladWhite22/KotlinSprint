package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val startTimeHour = 9
    val startTimeMinute = 39
    val travelTimeMinute = 457

    val sumStartTimeMinute = (startTimeHour * MINUTES_IN_HOUR) + startTimeMinute

    val finishHour = (sumStartTimeMinute + travelTimeMinute) / MINUTES_IN_HOUR
    val finishMinute = (sumStartTimeMinute + travelTimeMinute) % MINUTES_IN_HOUR

    println(String.format("%02d:%02d", finishHour, finishMinute))
}

