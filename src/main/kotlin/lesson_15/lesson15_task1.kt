package org.example.lesson_15

fun main() {
    val crucianCarp = СrucianСarp()
    crucianCarp.Swim()

    val gull = Gull()
    gull.Fly()

    val duck = Duck()
    duck.Swim()
    duck.Fly()
}

interface SwimMove {
    fun Swim() {
        return println("Плывёт")
    }
}

interface FlyMove {
    fun Fly() {
        return println("Летит")
    }
}

class СrucianСarp : SwimMove {
    override fun Swim() {
        super.Swim()
    }
}

class Gull : FlyMove {
    override fun Fly() {
        super.Fly()
    }
}

class Duck : SwimMove,FlyMove {
    override fun Swim() {
        super.Swim()
    }

    override fun Fly() {
        super.Fly()
    }
}

