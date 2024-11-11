package org.example.lesson_15

const val TRUCK_LOAD_CAPACITY: Byte = 2
const val TRUCK_LOAD_PASSENGER: Byte = 1
const val CAR_LOAD_PASSENGER: Byte = 3

fun main() {
    val car1 = PassengerCar()
    val car2 = PassengerCar()
    val track1 = Truck()

    car1.loadPassengers(3)
    car2.loadPassengers(2)
    track1.loadCargo(2)
    track1.loadPassengers(1)
}

interface Movment {
    fun startMove() {
        println("Автомобиль начал движение")
    }
}

interface PassengerTransportation {
    fun loadPassengers(numberPassenger: Byte)
    fun unloadPassengers()
}

interface CargoTransportation {
    fun loadCargo(numberCapacity: Byte) {
        if (numberCapacity <= TRUCK_LOAD_CAPACITY) println("Загрузили $numberCapacity тон груза")
        else println("Перегруз!")
    }

    fun unloadCargo() {
        println("Груз выгружен")
    }
}

class Truck() : Movment, CargoTransportation, PassengerTransportation {
    override fun loadPassengers(numberPassenger: Byte) {
        if (numberPassenger <= TRUCK_LOAD_PASSENGER) println("В грузовик сел $numberPassenger пассажир")
        else println("Место только для одного пассажира!")
    }

    override fun unloadPassengers() {
        println("Пассажир вышел")
    }
}

class PassengerCar() : Movment, PassengerTransportation {

    override fun loadPassengers(numberPassenger: Byte) {
        if (numberPassenger <= CAR_LOAD_PASSENGER) println("В автомобиль сел $numberPassenger пассажир")
        else println("Поместятся только 3 пассажира!")
    }

    override fun unloadPassengers() {
        println("Пассажир вышел")
    }
}