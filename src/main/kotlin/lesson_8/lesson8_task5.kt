package org.example.lesson_8

fun main() {

    println("Введите кол-во элементов:")
    val numberOfElements = readln().toInt()
    var array = Array(numberOfElements) { "" }
    for (i in array.indices) {
        println("Введите элемент массива:")
        val newElement = readln()
        array[i] += newElement
    }
    println(array.joinToString())
}