package org.example.lesson_21

fun main() {
    val player1 = Player1("Alex", 100, 100)
    println(player1.isHealthy())
}

class Player1(val name: String, val fullHealth: Int, var currentHealth: Int)

fun Player1.isHealthy(): Boolean {
   return this.fullHealth == this.currentHealth
}
