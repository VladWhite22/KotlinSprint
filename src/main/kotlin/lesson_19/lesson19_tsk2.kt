package org.example.lesson_19

fun main() {
    val product1 = Product("Куртка", 1, OnlineStore.CLOTHING.printName())
    val product2 = Product("Карандаш", 45, OnlineStore.OFFICE_SUPPLIES.printName())
    val product3 = Product("Пакет", 143, OnlineStore.VARIA.printName())

    product1.printProductInfo()
    product2.printProductInfo()
    product3.printProductInfo()
}

enum class OnlineStore {
    CLOTHING {
        override fun printName(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES {
        override fun printName(): String {
            return "Канцелярские товары"
        }
    },
    VARIA {
        override fun printName(): String {
            return "Разное"
        }
    };

    abstract fun printName(): String
}

class Product(val name: String, val id: Int, val category: String) {
    fun printProductInfo() {
        println("Назавание товара:$name Id:$id Категория:$category")
    }
}