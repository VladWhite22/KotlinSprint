package org.example.lessson_17

fun main() {
    val floder1 = Folder("архив1", 100, true)
    println("${floder1.name} ${floder1.numberOfFiles} ${floder1.isSecret}")
}

class Folder(_name: String, _numberOfFiles: Int, _isSecret: Boolean) {
   val name = _name
        get() = (if (isSecret == true) "Это сектретная папка"
        else field)
    val numberOfFiles = _numberOfFiles
        get() = (if (isSecret == true) 0
        else field)
    val isSecret = _isSecret
}