package org.example.lesson_11

fun main(){


    val forum1 = Forum()
    forum1.createNewUser("Gor")
    forum1.createNewUser("gfgf")
    forum1.createNewMessage(1,"fdfdf")
}
class ForumMember(
    var userId: Int,
    val userName: String,)

class ForumMesage(
    var authoId: Int,
    var message: String,)

class Forum (){
    val forumMembers:MutableList<ForumMember> = mutableListOf()
    val forumMesage:MutableList<ForumMesage> = mutableListOf()

    fun createNewUser(userName: String) {
        var id = forumMembers.size
        val forumMember = ForumMember(userId = id, userName)
        forumMembers.add(forumMember)
    }

    fun createNewMessage(authoId: Int, message: String) {
        val _forumMesage = ForumMesage(authoId = authoId, message = message)
        for (i in forumMembers.userId){
            if( i == _forumMesage.authoId)
            forumMesage.add(_forumMesage)
        }
        //    fun createNewMessage(authoId: Int,message: String) {
//        val _forumMesage = ForumMesage(authoId = authoId, message = message)
//        var a = 0
//        for (i in 0..999){
//            if( forumMembers[i].userId == _forumMesage.authoId)
//                forumMesage.add(_forumMesage)
//            a++
//        }
    }
    fun printThread() {
        println("${forumMembers.authoId}:${forumMesage.message}")
    }
}
