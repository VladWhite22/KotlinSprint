package org.example.lesson_2

fun main() {
    val crystalOre: Byte = 7
    val ferumOre: Byte = 11

    val sumCrystalOre: Float = crystalOre * 1.2f
    val sumFerumOre: Float = ferumOre * 1.2f

    val bafCrystalOre = (sumCrystalOre - crystalOre).toInt()
    val bafFerumOre = (sumFerumOre - ferumOre).toInt()

    println("Кристалическая руда: $bafCrystalOre")
    println("Железная руда: $bafFerumOre")
}