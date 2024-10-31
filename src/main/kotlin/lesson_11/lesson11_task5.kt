package org.example.lesson_11

fun main() {
    val forum1 = Forum()

    forum1.createNewUser("Alex")
    forum1.createNewUser("Oleg")
    forum1.createNewMessage("Alex", 0, "Здравствуйте!")
    forum1.createNewMessage("Oleg", 1, "Привет")
    forum1.printThread()
}

class ForumMember(
    var userId: Int,
    val userName: String,
)

class ForumMessage(
    val userName: String,
    var authorId: Int,
    var message: String,
)

class Forum {
    private val forumMembers: MutableList<ForumMember> = mutableListOf()
    private val forumMessage: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String) {
        var id = forumMembers.size
        val _forumMember = ForumMember(userId = id, userName)
        forumMembers.add(_forumMember)
    }

    fun createNewMessage(userName: String, authorId: Int, message: String) {
        val _forumMesage = ForumMessage(userName = userName, authorId = authorId, message = message)
        for (i in forumMembers)
            if (i.userId == authorId && i.userName == userName) forumMessage.add(_forumMesage)
    }

    fun printThread() {
        for (n in forumMessage)
            println("${n.userName}:${n.message}")
    }
}
