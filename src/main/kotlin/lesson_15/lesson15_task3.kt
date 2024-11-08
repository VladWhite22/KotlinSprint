package org.example.lesson_15

fun main(){
val user1 = UsualUser()
    val user2 = UsualUser()
    val admin1 = AdminUser()
    user1.readForum()
    user2.writeMessage()
    admin1.deliteUser()
}

abstract class User {
    fun writeMessage() {
        println("Написать сообщение")
    }

    fun readForum() {
        println("Читать форум")
    }
}

class UsualUser(): User()

class AdminUser():User() {
    fun delitMessage() { println("Удалить сообщение")}
    fun deliteUser() {println("Удалить пользователя")}
}