package org.example.lesson_2

import kotlin.math.pow

const val PERCENT = 100
fun main() {
    val depositedMoney: Int = 70000
    val interestRate: Double = 16.7
    val depositedTime: Double = 20.0


    val totalMoney = depositedMoney * (((PERCENT + interestRate) / PERCENT).pow(depositedTime))
    println(String.format("%.3f", totalMoney))
}