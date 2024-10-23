package org.example.lesson_11

fun main(){
val forum1=Forum
}
class Forum (forumMember: ForumMember,forumMesage: ForumMesage)

    class ForumMember(
        val userId: MutableList<Int>,
        val userName: MutableList<String>,
    ) {
        fun createNewUser(UserName: String) {
            val id = userName.size
            userName.add(UserName)
            userId.add(id)
        }
    }

    class ForumMesage(
        val authoId: Int,
        var message: String,
    ) {
        fun createNewMessage(userId: MutableList<Int>) {
            if (userId.contains(authoId))
                message = readln()
        }

        fun printThread(message: String) {
            println("$authoId:$message")
        }
    }
