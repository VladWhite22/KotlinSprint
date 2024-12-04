package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBook("Война и мир", "Л.Н Толстой ")
    val regularBook2 = RegularBook("Война и мир", "Л.Н Толстой ")
    println(regularBook1)
    println(regularBook2)

    val dataBook1 = DataBook("Тихий Дон", "М.А Шолохов")
    val dataBook2 = DataBook("Тихий Дон", "М.А Шолохов")

    println(regularBook1 == regularBook2)// В случае с обыными классами компилятор наследует метод equals() который сравнивает ссылки на объекты класса,
    // org.example.lesson_22.RegularBook@34c45dca == org.example.lesson_22.RegularBook@52cc8049 -> false

    println(dataBook1 == dataBook2)//В случае с дата классами метод equals() сравнивает значения свойств объектов, ("Тихий Дон", "М.А Шолохов")==("Тихий Дон", "М.А Шолохов") -> true
}

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)