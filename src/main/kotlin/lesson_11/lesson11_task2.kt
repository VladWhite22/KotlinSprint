package org.example.lesson_11

import kotlin.properties.Delegates

fun main() {
    val user = User2(id = 1, login = "test", password = "Test", email = "test@mail")
    user.writeInBio()
    user.chengePassword()
    user.printlnUserParameters()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun writeInBio() {
        println("Заполните bio:")
        this.bio = readln()
    }

    fun printlnUserParameters() {
        return println(
            """
        BIO:${bio}
        ID : ${id}
        Login : ${login}  
        Password : ${password}
        EMail : ${email}""".trimIndent()
        )
    }

    fun chengePassword() {
        println("Введите пароль:")
        var getPassword = readln()
        if (getPassword == password) {
            println("Введите новый пароль:$getPassword")
            password = readln()
            println("Пароль изменен на:$password")
        }
    }
}