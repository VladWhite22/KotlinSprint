package org.example.lesson_15

fun main() {
    val instrument1 = Instruments("Гитара", 5)
    val components = Components("Струны", 100)
    instrument1.findComponent("Струны")
}

interface Find {
    fun findComponent(nameFind: String) {
        println("Выполняется поиск $nameFind")
    }
}

abstract class Goods(val name: String, val quantity: Int)

class Instruments(name: String, quantity: Int) : Goods(name, quantity), Find

class Components(name: String, quantity: Int) : Goods(name, quantity)