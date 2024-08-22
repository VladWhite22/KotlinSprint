package org.example.lesson_2

fun main() {
    val startTimeHour = 9
    val startTimeMinute = 39
    val sumStartTimeMinute = (startTimeHour * 60) + startTimeMinute
    val trevelTimeMinute = 457

    val finishHour: String = String.format("%02d", (sumStartTimeMinute + trevelTimeMinute) / 60)
    val finishMinute: String = String.format("%02d", (sumStartTimeMinute + trevelTimeMinute) % 60)

    println("$finishHour:$finishMinute")
}