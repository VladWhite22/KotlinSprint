package org.example.lesson_14

fun main() {
    val object1 = Planet("Марс", true, true)
    val object2 = Sputnik("Деймос", false, false)
    val object3 = Sputnik("Фобос", false, false)

    object1.listOfSputniks.add(object2)
    object1.listOfSputniks.add(object3)

    println("${object1.name} ${object1.atmosfer} ${object1.suitabilityForPlanting} ")

    for (sputnik in object1.listOfSputniks) {
        println("${sputnik.name} ${sputnik.atmosfer} ${sputnik.suitabilityForPlanting}")
    }

}

abstract class SpaceObject(
    val name: String,
    val atmosfer: Boolean,
    val suitabilityForPlanting: Boolean,
)

class Planet(name: String, atmosfer: Boolean, suitabilityForPlanting: Boolean) :
    SpaceObject(name, atmosfer, suitabilityForPlanting) {
    var listOfSputniks = mutableListOf<Sputnik>()
}

class Sputnik(name: String, atmosfer: Boolean, suitabilityForPlanting: Boolean) :
    SpaceObject(name, atmosfer, suitabilityForPlanting)