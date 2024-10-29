package org.example.lesson_13

fun main() {
    val contact1 = Companys("Олег", 89606457845, null)
    val contact2 = Companys("Игорь", 89005553535, null)
    val contact3 = Companys("Анна", 89034434354, "FNX")
    val contact4 = Companys(null, 83443434334, null)
    val contact5 = Companys("Эдуард", 89232344323, "AML")

    val listContacts = listOf<Companys>(contact1, contact2, contact3, contact4, contact5)

    for (company in listContacts)
        if (company.company != null) println(company.company)
}

class Companys(
    var name: String?,
    var phoneNumber: Long?,
    var company: String?,)