package org.example.lesson_20

fun main() {
    var stringList = listOf("0", "1", "2", "3", "4")
    var lambdaList = mutableListOf<() -> Unit>()

    stringList.map { { it: String -> lambdaList.add({ println("Нажат элемент $it") }) } }

    lambdaList.mapIndexed { idx, it -> if (idx % 2 == 0) it }

}