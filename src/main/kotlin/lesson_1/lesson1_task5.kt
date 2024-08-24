package org.example.lesson_1

fun main() {
    val seconds = 6480
    val secondsInHour = 3600
    val minutesInHour = 60
    val fullHour = seconds / secondsInHour
    val fullMinutes = (seconds % secondsInHour) / minutesInHour
    val fullSeconds = seconds % minutesInHour

    println("%02d:%02d:%02d".format(fullHour, fullMinutes, fullSeconds))
}