package org.example.lesson_13

fun main() {
    val company1 = Company("Анна", 89606457845)
    company1.printCompany()
}

class Company(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printCompany() {
        println("$name $phoneNumber ${company ?: "<не указано>"}")
    }
}