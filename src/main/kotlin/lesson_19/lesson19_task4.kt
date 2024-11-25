package org.example.lesson_19

fun main() {
    val tank1 = Tank()
    tank1.loadShell(TankShell.BLUE)
    tank1.shoot()
}

enum class TankShell(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    var tank: Int? = null

    fun loadShell(tankShell: TankShell) {
        this.tank = tankShell.damage
    }

    fun shoot() {
        println(tank)
    }
}