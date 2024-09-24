package org.example.lesson_8

fun main() {
    val pelmeni = arrayOf("фарш", "перец молотый", "соль", "тесто")

    println("Введите название ингредиента:")
    val ingridient = readln()
    if (pelmeni.contains(ingridient)) println("Ингредиент $ingridient в рецепте есть!")
    else println("Ингредиента в рецепте нет!")
}