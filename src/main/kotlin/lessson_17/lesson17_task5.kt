package org.example.lessson_17

fun main() {
    val user1 = User("Alex", "ALEX")
    user1.password = "Alex_"
    println(user1.password)
    user1.login = "Ivan"
}

class User(_login: String, _password: String) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password = _password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() = repeat(field.length) { println("*") }.toString()
}