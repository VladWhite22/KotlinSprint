package org.example.lesson_11

fun main(){

}

class ForumMember(
    val userId: Int,
    val userName: String,)

class ForumMesage(
    val authoId: Int,
    var message: String,)

class Forum (){
    val forumMembers:ArrayList<ForumMember> = ArrayList<ForumMember>()
    val forumMesage:ArrayList<ForumMesage> = ArrayList<ForumMesage>()

    fun createNewUser(userName: String,userId:Int) {
        forumMembers.userName.add(userName)
        forumMembers.userId.add(userId)
    }
    fun createNewMessage(authoId: Int,message: String) {
        if (forumMembers.userId.contains(authoId))
            forumMesage.message.add(message)
    }

    fun printThread(message: String) {
        println("$authoId:$message")
    }

}
