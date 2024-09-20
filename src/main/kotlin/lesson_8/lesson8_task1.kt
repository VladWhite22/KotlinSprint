package org.example.lesson_8

fun main() {
    val days = 1..7
    var statisticsVievs = intArrayOf()
    for (day in days) {
        println("Введите кол-во просмотров за день $day")
        val views = readln().toInt()
        statisticsVievs += views
    }
    println("Кол-во просмотров за ${days.last} суток:${statisticsVievs.sum()}")
}