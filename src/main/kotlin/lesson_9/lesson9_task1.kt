package org.example.lesson_9

fun main() {
    val pelmeni = listOf("фарш", "тесто", "лук")

    println("В рецепте есть следующие ингредиенты:")
    println("${pelmeni.forEach { println(it) }}")
}