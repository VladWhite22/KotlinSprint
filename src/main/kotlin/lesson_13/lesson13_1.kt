package org.example.lesson_13

fun main() {
    val company1 = CompanyInformation("Anna", 89605462896, null)
}

class CompanyInformation(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)