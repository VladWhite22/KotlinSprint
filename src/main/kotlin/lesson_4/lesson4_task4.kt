package org.example.lesson_4

fun main() {
    val treningDay = 5
    val isEven =  treningDay % 2 == 1


    println(
        "Упражнения для рук: $isEven\n" +
                "Упражнения для ног: ${isEven.not()} \n" +
                "Упражнения для спины: ${isEven.not()} \n" +
                "Упражнения для пресса: $isEven"
    )
}
