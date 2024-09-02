package org.example.lesson_4

fun main() {
    val treningDay = 5
    val isEven =  treningDay % 2 == 0


    println(
        "Упражнения для рук: ${!isEven}\n" +
                "Упражнения для ног: $isEven \n" +
                "Упражнения для спины: $isEven \n" +
                "Упражнения для пресса: ${!isEven}"
    )
}
