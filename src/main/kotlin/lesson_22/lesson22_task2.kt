package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBooks("Война и мир", "Л.Н Толстой ")

    val dataBook1 = DataBooks("Тихий Дон", "М.А Шолохов")

    println(regularBook1)// В случае с обыными классами метод println() выводит в консоль ссылку на объект класса
    println(dataBook1)//В случае с дата классами метод println() выводит в конслоь содержимое класса
}

class RegularBooks(val title: String, val author: String)

data class DataBooks(val title: String, val author: String)