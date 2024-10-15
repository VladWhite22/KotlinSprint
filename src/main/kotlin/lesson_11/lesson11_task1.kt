package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String, ) {
    fun printlnUserParameters() {
        return println(
            """
        ID : ${id}
        Login : ${login}  
        Password : ${password}
        EMail : ${email}""".trimIndent()
        )
    }
}

fun main() {
    val user1 = User(id = 1, login = "abv", password = "qwe123", email = "user1@mail.ru")
    val user2 = User(id = 2, login = "abvg", password = "qwe123-", email = "user2@mail.ru")
    user1.printlnUserParameters()
    user2.printlnUserParameters()
}
