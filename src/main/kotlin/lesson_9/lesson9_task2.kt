package org.example.lesson_9

fun main() {
    var salad = mutableListOf("помидор", "огурец", "лук")
    println("В рецепте есть базовые ингредиенты:$salad" +
                "\nЖелаете добавить ещё?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        salad.add(userIngredient)
        println(salad) }
}