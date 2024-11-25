package org.example.lesson_20

fun main() {
    val stringList = listOf("0", "1", "2", "3", "4")

    stringList.mapIndexed { idx, it: String -> if (idx % 2 == 0) println("Нажат элемент $it") }
}