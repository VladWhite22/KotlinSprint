package org.example.lessson_17

fun main(){
val package1 = Package(1,"На сц")
    println(package1.counter)
    package1.location="В пути"
    println(package1.counter)
    package1.location="В пути"
    println(package1.counter)
}

class Package( _packageNumber: Int, _location: String) {
    var counter:Int = 0
    var packageNumber = _packageNumber
    var location = _location
    set(value) {
        field = value
        if (field != value) counter++
    }

}