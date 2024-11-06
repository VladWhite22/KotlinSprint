package org.example.lesson_15

fun main() {
    val crucianCarp = СrucianСarp()
    crucianCarp.crucianСarpMove()

    val gull = Gull()
    gull.gullMove()

    val duck = Duck()
    duck.duckMove1()
    duck.duckMove2()
}

interface СrucianСarpMove {
    fun crucianСarpMove() {
        return println("Плывёт")
    }
}

interface GullMove {
    fun gullMove() {
        return println("Летит")
    }
}

interface DuckMove {
    fun duckMove1() {
        return println("Плывёт")
    }

    fun duckMove2() {
        return println("Летит")
    }
}

class СrucianСarp : СrucianСarpMove {
    override fun crucianСarpMove() {
        super.crucianСarpMove()
    }
}

class Gull : GullMove {
    override fun gullMove() {
        super.gullMove()
    }
}

class Duck : DuckMove {
    override fun duckMove1() {
        super.duckMove1()
    }

    override fun duckMove2() {
        super.duckMove2()
    }
}

