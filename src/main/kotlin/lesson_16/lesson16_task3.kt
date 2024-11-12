package org.example.lesson_16

fun main() {
    val user1 = User("Alex", "ALEX")
    println(user1.checkPassword())
}

class User( val login: String,  val password: String) {
    private val passwordUser: String = "ALEX_"

    fun checkPassword(): Boolean {
        return if (password == passwordUser) true
        else false
    }
}

