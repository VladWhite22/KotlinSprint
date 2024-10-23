package org.example.lesson_11

fun main() {

}
class Сategory(
    val categoryName: String,
    val categoryDescription: String,
    val imageUrl: String,
)

class Dish(
    val dishName: String,
    val isFavorit: Boolean,
    val cooking:List<String>,
)

class Ingredient(
    val ingredient: String,
    val qantity: Int,
    val portion: Int,
)