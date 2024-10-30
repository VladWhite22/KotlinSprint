package org.example.lesson_13

fun main() {
    val company1 = Company("Олег", 89606457845)
    company1.printCompany()
}

class Company(
    var name: String,
    var phoneNumber: Long,
    var company:String? = null, ) {

    fun printCompany() {
        if(name == null) name = "<не указано>"
        println("$name $phoneNumber $company")
    }
}