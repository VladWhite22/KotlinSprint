package org.example.lesson_4

fun main() {
    val treningDay = 5
    val resultHandsPress = treningDay % 2 == 1
    val resultLegsBack = treningDay % 2 == 0

    println(
        "Упражнения для рук: $resultHandsPress\n" +
                "Упражнения для ног: $resultLegsBack \n" +
                "Упражнения для спины: $resultLegsBack \n" +
                "Упражнения для пресса: $resultHandsPress"
    )
}
