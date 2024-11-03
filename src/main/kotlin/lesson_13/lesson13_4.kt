package org.example.lesson_13

fun main() {
    val contact = Company2()

    fun addContact(
        _name: String = readln(),
        _phoneNumber: Long? = readln().toLongOrNull(),
        _company: String? = readln()
    ) {
        if (_phoneNumber == null) {
            return println("Контакт не добавлен! Вы не ввели номер телефона.")
        }
        contact.listContacts.add(Company2(_name, _phoneNumber, _company))
    }

    fun printContacts() {
        for (i in contact.listContacts) {
            println(
                "${i.name}" +
                        "\n${i.phoneNumber}" +
                        "\n${i.company}"
            )
        }
    }
    addContact()
    addContact()
    printContacts()
}


class Company2(
    val name: String? = null,
    val phoneNumber: Long? = null,
    val company: String? = null
) { val listContacts = mutableListOf<Company2>() }



