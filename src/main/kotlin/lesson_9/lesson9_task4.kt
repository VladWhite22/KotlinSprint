package org.example.lesson_9

fun main() {
    println("Введите 5 знчений через запятую c пробелом:")

    val userIngredient = readln()
    val userListOfIngredients = userIngredient.split(", ")

    println(userListOfIngredients.sorted())
}