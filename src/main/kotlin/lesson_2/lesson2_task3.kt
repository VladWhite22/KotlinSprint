package org.example.lesson_2

fun main() {
    val startTimeHour = 9
    val startTimeMinute = 39
    val travelTimeMinute = 457
    val minutesInHour = 60
    val sumStartTimeMinute = (startTimeHour * minutesInHour) + startTimeMinute

    val finishHour = (sumStartTimeMinute + travelTimeMinute) / minutesInHour
    val finishMinute = (sumStartTimeMinute + travelTimeMinute) % minutesInHour

    println(String.format("%02d:%02d", finishHour, finishMinute))
}