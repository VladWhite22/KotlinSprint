package org.example.lesson_20

fun main() {
    val userHello: (String) -> Unit = { userName: String -> println(" С наступающим Новым Годом, $userName!") }
    userHello("Oleg")
}