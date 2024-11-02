package org.example.lesson_13

fun main() {
    val contact = Company2()
    contact.addContact()
    contact.addContact()
    contact.printContacts()
}

class Company2 {
    var listContacts = mutableListOf<Company2>()
    val name: String = ""
    val phoneNumber: Long? = null
    val company: String? = null

    fun addContact(
        _name: String = readln(),
        _phoneNumber: Long? = readln().toLongOrNull(),
        _company: String? = readln()

    ) {
        if (_phoneNumber == null) {
            return println("Контакт не добавлен! Вы не ввели номер телефона.")
        }
        listContacts.add(Company2())
    }

    fun printContacts() {
        for (i in listContacts) {
            println(
                "${i.name}" +
                        "\n${i.phoneNumber}" +
                        "\n${i.company}"
            )
        }
    }
}