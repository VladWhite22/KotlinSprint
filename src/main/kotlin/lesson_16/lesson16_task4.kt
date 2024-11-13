package org.example.lesson_16

fun main() {
    Order().contactManager("В обработке")
}

class Order {
    private val orderNumber: Int = 5
    var readinessStatus: String = "По умолчанию"

    private fun changeStatus(newStatus: String) {
        readinessStatus = newStatus
        println(readinessStatus)
    }

    fun contactManager(newStatus: String) {
        return Order().changeStatus(newStatus)
    }
}