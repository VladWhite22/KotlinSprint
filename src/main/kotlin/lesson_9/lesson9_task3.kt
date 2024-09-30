package org.example.lesson_9

fun main() {
    val omelette = listOf("яйца", "молоко", "сливочное масло")
    val omeletteIngridients = listOf(2, 50, 15)

    println("Введите количество порций:")
    val numberOfServings = readln().toInt()

    val omeletteIngridients2 = omeletteIngridients.map { it * numberOfServings }
    val result = omelette.zip(omeletteIngridients2)

    println("На $numberOfServings порций вам понадобится:\n$result")
}