package org.example.lesson_21
import java.io.File
import java.util.*

fun main() {
    val file1 = File("file1.txt")
    file1.addText("TEXT2")
}

fun File.addText(newText: String) {
    val listText = this.readLines()
   val newElement = this.appendText(newText.lowercase(Locale.getDefault()))
   val resut = listText.addFirst(newElement.toString())
    return resut
}