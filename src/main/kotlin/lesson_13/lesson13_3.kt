package org.example.lesson_13

fun main() {
    val contact1 = Company1("Олег", 89606457845, null)
    val contact2 = Company1("Игорь", 89005553535, null)
    val contact3 = Company1("Анна", 89034434354, "FNX")
    val contact4 = Company1("Ольга", 83443434334, null)
    val contact5 = Company1("Эдуард", 89232344323, "AML")

    val listContacts = listOf<Company1>(contact1, contact2, contact3, contact4, contact5)

    println(listContacts.mapNotNull { it.company })
}

class Company1(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)