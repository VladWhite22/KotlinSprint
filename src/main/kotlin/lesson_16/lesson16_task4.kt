package org.example.lesson_16

fun main() {
    fun contactManager(newStatus: String) {
        return Order().changeStatus(newStatus)
    }
    contactManager("В обработке")
}

class Order {
    private val orderNumber: Int = 5
    private var readinessStatus: String = ""

    fun changeStatus(newStatus: String) {
        readinessStatus = newStatus
    }
}