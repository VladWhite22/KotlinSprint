package org.example.lesson_8

fun main() {
    var pelmeni = arrayOf("фарш", "перец молотый", "соль", "тесто")
    println("${pelmeni.joinToString()} \nВведите ингредиент который хотите заменить:")
    val userIngredient = readln()
    var caunter = 0

    for (i in pelmeni) {
        caunter++
        if (i == userIngredient) {
            println("Введите ингредиент который хотите добавить:")
            val userIngredientNew = readln()
            pelmeni[caunter - 1] = userIngredientNew
            println("Готово! Вы сохранили следующий список:\n${pelmeni.joinToString()}")
            break
        }
        if (caunter == pelmeni.size && i != userIngredient) println("Ингредиента в рецепте нет!")
    }
}