package org.example.lesson_19

fun main() {
    for (fish in Fishs.values()) println(fish)
}

enum class Fishs {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}