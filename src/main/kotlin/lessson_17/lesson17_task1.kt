package org.example.lessson_17

fun main() {
}

class VictorinaElemrnt(question: String, answer: String) {
    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}