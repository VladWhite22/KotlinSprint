package org.example.lesson_11

fun main() {
    val user1 = Room.User("(ಠ_ಠノ)", "Alex")
    val user2 = Room.User("（≧ロ≦）", "Oleg")

    val room1 = Room("Kotlin","Class")

    user1.updateStatus()
    room1.addUser(user1)
    room1.addUser(user2)
}

class Room(
    val cover: String,
    val title: String,

) {
    var usersList: MutableList<User>? = null

    class User(
       var avatar: String,
       var nickname: String,
        ) {

        var userStatus: Array<String> = arrayOf("разговаривает", "микрофон выключен", "пользователь заглушен")
        fun updateStatus() {
            println("Введите новый nickname:")
            nickname= readln()
            val newStatus = userStatus.random()
            println("$nickname $newStatus")
        }
    }

    fun addUser(user: User) {
        usersList?.add(user)
    }
}
