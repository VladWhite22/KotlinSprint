package org.example.lesson_22

fun main() {
    val book1 = DatBooks("Война и мир", "Л.Н Толстой", 1873)
    val (title, author, year) = book1
    println("Title:$title Author:$author Year:$year")
}

data class DatBooks(val title: String, val author: String, val year: Int)