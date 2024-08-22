package org.example.lesson_1

fun main() {
    val seconds: Int = 6480
    val fullHour: String = String.format("%02d", seconds / 3600)
    val fullMinutes: String = String.format("%02d", (seconds % 3600) / 60)
    val fullSeconds: String = String.format("%02d", (seconds % 60))

    println("$fullHour:$fullMinutes:$fullSeconds")
}