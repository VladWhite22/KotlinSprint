package org.example.lesson_5

fun main(){
    val nameBookd ="Zaphod"
    val passwordBookd ="PanGalactic"

    println("Приветствуем вас на корабле Heart of Gold! \n" +
             "Введите ваше имя:")
    val name = readln().toString()
    if(name==nameBookd) println("Введите пароль:")
    val password = readln().toString()
    if (name != nameBookd) println("Зарегестрируйте нового пользователя:")
    val nameNewUser= readln().toString()
    val passwordNewUser= readln().toString()
    when{password==passwordBookd-> println("Вы можете можете управлять кораблем и осуществлять навигацию по вселенной!") }
}