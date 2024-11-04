package org.example.lesson_13

fun main() {
    val listContacts = mutableListOf<Company2>()

    fun addContact(
        _name: String = readln(),
        _phoneNumber: Long? = readln().toLongOrNull(),
        _company: String? = readln()) {
        if (_phoneNumber == null) { return println("Контакт не добавлен! Вы не ввели номер телефона.") }
        listContacts.add(Company2(_name, _phoneNumber, _company)) }

    addContact()
    addContact()
    for ( i in listContacts ) { i.printContacts() }
}

class Company2(
    val name: String? = null,
    val phoneNumber: Long? = null,
    val company: String? = null){
    fun printContacts() { println("${name}" + "\n${phoneNumber}" + "\n${company}") }
}



