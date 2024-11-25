package org.example.lesson_20

fun main() {
    val player1 = Player1();

    { player: Player1 -> if (player.key == true) println("Игрок открыл дверь") else println("Дверь заперта") }(player1)
}

class Player1 {
    val key = true
}