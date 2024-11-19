package org.example.lesson_18

fun main() {
    val fox1 = Fox("Алиса")
    val dog1 = Dog("Бим")
    val cat1 = Cat("Бегемот")

    val animalsArray= arrayOf<Animal>(fox1,dog1,cat1)
    for (animal in animalsArray) animal.eat()
}

open class Animal(val name: String) {
    open fun eat() {}
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("${name}->Ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("${name}->Ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("${name}->Ест рыбу")
    }
}