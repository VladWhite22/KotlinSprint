package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val ferrumOre: Byte = 11
    val bafSizePercent = 20
    val percent = 100

    val sumCrystalOre = crystalOre * (bafSizePercent + percent) / percent
    val sumFerrumOre = ferrumOre * (bafSizePercent + percent) / percent

    val bafCrystalOre = (sumCrystalOre - crystalOre)
    val bafFerrumOre = (sumFerrumOre - ferrumOre)

    println("Кристалическая руда: $bafCrystalOre")
    println("Железная руда: $bafFerrumOre")
}