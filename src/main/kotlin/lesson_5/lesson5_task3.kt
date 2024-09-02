package org.example.lesson_5

fun main() {
    val number1 = 22
    val number2 = 7

    println("Введите число от 0 до 42")
    val userNumber1 = readln().toInt()
    println("Введите число от 0 до 42")
    val userNumber2 = readln().toInt()

    if (userNumber1 == number1 && userNumber2 == number2 ||
        userNumber1 == number2 && userNumber2 == number1) {
        println("Поздравляем! Вы выиграли главный приз!") }
    else if (userNumber1 == number1 || userNumber2 == number2 ||
        userNumber1 == number2 || userNumber2 == number1) {
        println("Вы выиграли утешительный приз!") }
    else
        println("Неудача!")
}