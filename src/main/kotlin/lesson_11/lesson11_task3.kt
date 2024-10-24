package org.example.lesson_11

fun main() {
    val user1 = User("(ಠ_ಠノ)", "Alex", "Разговаривает")
    val user2 = User("（≧ロ≦）", "Oleg", "Микрофон выключен")

    val room1 = Room("Kotlin", "1")

    room1.addUser(user1)
    room1.addUser(user2)
    user1.updateStatus("Alex","Микрофон выключен")

}
class User(
    var avatar: String,
    var nickname: String,
    var userStatus: String,
)
class Room(
    val cover: String,
    val title: String,
    var usersList: ArrayList<User> = ArrayList<User>(),
) {

    fun addUser(user: User) {
        usersList.add(user)
    }

    fun User.updateStatus(nickname: String, userStatus: String) {
        if (nickname == this.nickname) {
            this.userStatus = userStatus
        }
    }
}


