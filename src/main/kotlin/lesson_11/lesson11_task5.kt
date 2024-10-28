package org.example.lesson_11

fun main() {
    val forum1 = Forum()
    forum1.createNewUser("Gor")
    forum1.createNewUser("gfgf")
    forum1.createNewMessage(1, "fdfdf")
}

class ForumMember(
    var userId: Int,
    val userName: String,
)

class ForumMesage(
    var authoId: Int,
    var message: String,
)

class Forum {
    val forumMembers: MutableList<ForumMember> = mutableListOf()
    val forumMesage: MutableList<ForumMesage> = mutableListOf()

    fun createNewUser(userName: String) {
        var id = forumMembers.size
        val forumMember = ForumMember(userId = id, userName)
        forumMembers.add(forumMember)
    }

    fun createNewMessage(authoId: Int, message: String) {
        val _forumMesage = ForumMesage(authoId = authoId, message = message)
        forumMembers.find { it.userId == authoId }
        forumMesage.add(_forumMesage)
    }

    fun printThread() {
        for (a in forumMembers.userId)
        for (b in forumMembers.userName)
            println("$a:$b")
    }
}
