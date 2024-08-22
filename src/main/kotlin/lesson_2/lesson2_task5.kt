package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositedMoney: Int = 70000
    val interestRate: Double = 0.167
    val depositedTime: Double = 20.0

    val totalMoney = depositedMoney * ((1 + interestRate).pow(depositedTime))
    println(String.format("%.3f", totalMoney))
}