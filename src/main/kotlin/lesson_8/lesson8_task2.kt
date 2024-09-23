package org.example.lesson_8

fun main() {
    val pelmeni = arrayOf("фарш", "перец молотый", "соль", "тесто")

    println("Введите название ингредиента:")
    val ingridient = readln()
    var caunter = 0
    for (i in pelmeni) {
        if (i == ingridient) {
            println("Ингредиент $ingridient в рецепте есть!")
            break
        }
        caunter++
        if (caunter == pelmeni.size && i != ingridient) println("Ингредиента в рецепте нет!")
    }
}

