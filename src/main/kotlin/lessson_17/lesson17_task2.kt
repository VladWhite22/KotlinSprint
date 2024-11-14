package org.example.lessson_17

fun main() {
    val ship1 = Ship(4, "Главный порт")
    ship1.name = "Посудина"
}

class Ship(_speed: Int, _homePort: String) {
    var name = "Непотопляемый"
        set(value) {
            if (value != "Непотопляемый")
                println("Вы не можете изменить имя корабля")
        }
    var speed = _speed
    var homePort = _homePort
}