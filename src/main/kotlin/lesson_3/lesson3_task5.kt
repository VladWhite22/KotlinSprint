package org.example.lesson_3

fun main() {
    val playerMove = "D2-D4;0"
    val mString = playerMove.split("-", ";")

    var moveFrom = mString[0]
    var moveIn = mString[1]
    var moveNumber = mString[2]

    println(moveFrom)
    println(moveIn)
    println(moveNumber)
}


