package org.example.lesson_20

fun main() {
    val player1 = Player("Petr", 100, 50)

    val healingPotion: (Player) -> Unit =
        { player: Player -> player.currentHealth = (player.fullHealth - player.currentHealth) + player.currentHealth }

    healingPotion(player1)
    println(player1.currentHealth)
}

class Player(val name: String, val fullHealth: Int, var currentHealth: Int)