package org.example.lesson_8

fun main() {
    var pelmeni = arrayOf("фарш", "перец молотый", "соль", "тесто")

    println("${pelmeni.joinToString()} \nВведите ингредиент который хотите заменить:")

    val userIngredient = readln()

    if (userIngredient in pelmeni) {
        println("Введите ингредиент который хотите добавить:")
        val userIngredientNew = readln()
        pelmeni[pelmeni.indexOf(userIngredient)] = userIngredientNew
        println("Готово! Вы сохранили следующий список:\n${pelmeni.joinToString()}") }
    else println("Ингредиента в рецепте нет!")
}