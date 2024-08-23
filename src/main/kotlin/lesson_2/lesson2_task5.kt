package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositedMoney: Int = 70000
    val interestRate: Double = 16.7
    val depositedTime: Double = 20.0
    val percent = 100

    val totalMoney = depositedMoney * (((percent + interestRate) / percent).pow(depositedTime))
    println(String.format("%.3f", totalMoney))
}