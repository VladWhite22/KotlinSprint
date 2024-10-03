package org.example.lesson_9

fun main() {
    val dumplings = listOf("фарш", "тесто", "лук")

    println("В рецепте есть следующие ингредиенты:")
    dumplings.forEach { println(it)}
}