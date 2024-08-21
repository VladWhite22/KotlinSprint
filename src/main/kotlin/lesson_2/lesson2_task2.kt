package org.example.lesson_2

fun main() {
    val numberOfEmployers: Int = 50
    val sallaryEmployers: Int = 30000
    val numbersOfInterns: Int = 30
    val sallaryInterns: Int = 20000

    val employersSallarySum: Int = numberOfEmployers * sallaryEmployers
    val sumSallary: Int = numberOfEmployers * sallaryEmployers + numbersOfInterns * sallaryInterns
    val averageSalary: Int =
        ((numberOfEmployers * sallaryEmployers) + (numbersOfInterns * sallaryInterns)) / (numbersOfInterns + numberOfEmployers)

    println(employersSallarySum)
    println(sumSallary)
    println(averageSalary)
}
