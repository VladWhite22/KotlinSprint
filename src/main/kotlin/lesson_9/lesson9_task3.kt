package org.example.lesson_9

fun main() {
    val omelette = listOf("яйца", "молоко", "сливочное масло")
    val omeletteIngredients = listOf(2, 50, 15)

    println("Введите количество порций:")
    val numberOfServings = readln().toInt()

    val omeletteIngredients2 = omeletteIngredients.map { it * numberOfServings }
    val result = omelette.zip(omeletteIngredients2)

    println("На $numberOfServings порций вам понадобится:\n$result")
}