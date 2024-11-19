package org.example.lesson_18

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.productInformation("Кроссовки")
    order2.productInformation(listOf("Кроссовки", "Туфли", "Рубашка"))
}

class Order(val orderNumber: Int) {
    fun productInformation(product: String) {
        println("Заказан товар:$product")
    }

    fun productInformation(products: List<String>) {
        println("Заказаны следующие товары:$products")
    }
}