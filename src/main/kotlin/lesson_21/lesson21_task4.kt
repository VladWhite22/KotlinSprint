package org.example.lesson_21

import java.io.File
import java.util.*

fun main() {
    val file1 = File("file1.txt")
    file1.addText("TEXT1")
}

fun File.addText(newText: String) {
    val content = this.readText()
    this.writeText(newText.lowercase(Locale.getDefault()) + "\n" + content)
}