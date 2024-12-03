package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBook("Война и мир", "Л.Н Толстой ")
    val regularBook2 = RegularBook("Война и мир", "Л.Н Толстой ")

    val dataBook1 = DataBook("Тихий Дон", "М.А Шолохов")
    val dataBook2 = DataBook("Тихий Дон", "М.А Шолохов")

    println(regularBook1 == regularBook2)// В случае с обыными классами срвниваются ссылки на объекты, генерируются разные ссылки -> false
    println(dataBook1 == dataBook2)//В случае с дата классами сравниваются значения свойств объектов, значения объектов одинаковые -> true
}

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)