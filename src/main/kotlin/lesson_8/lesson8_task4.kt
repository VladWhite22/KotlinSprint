package org.example.lesson_8

fun main() {
    var pelmeni = arrayOf("фарш", "перец молотый", "соль", "тесто")

    println("${pelmeni.joinToString()} \nВведите ингредиент который хотите заменить:")

    val userIngredient = readln()
    val index = pelmeni.indexOf(userIngredient)
    if (index > -1) {
        println("Введите ингредиент который хотите добавить:")
        val userIngredientNew = readln()
        pelmeni[index] = userIngredientNew
        println("Готово! Вы сохранили следующий список:\n${pelmeni.joinToString()}") }
    else println("Ингредиента в рецепте нет!")
}



