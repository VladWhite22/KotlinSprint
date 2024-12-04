package org.example.lesson_22

fun main() {
    val regularBook1 = RegularBooks("Война и мир", "Л.Н Толстой ")

    val dataBook1 = DataBooks("Тихий Дон", "М.А Шолохов")

    println(regularBook1)//В случае с обыными классами метод println() выводит в консоль ссылку на объект в виде org.example.lesson_22.RegularBooks@52cc8049, поскольку
    //метод .toString (обявлен в родительском классе kotlin.Any) реализует возвращение имени класса за которым следует @ и шеснадцетиричное представление хэш-кода объекта

    println(dataBook1)//В случае с дата классами компилятор также как и с обычными классами наследует метод .toString, при объявленных свойствах в первичном конструкторе ("Война и мир", "Л.Н Толстой "),
// println() выводит в конслоь содержимое объекта класса в виде DataBooks(title=Тихий Дон, author=М.А Шолохов).


}

class RegularBooks(val title: String, val author: String)

data class DataBooks(val title: String, val author: String)