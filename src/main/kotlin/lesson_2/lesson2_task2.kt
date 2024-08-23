package org.example.lesson_2

fun main() {
    val numberOfEmployers: Int = 50
    val salaryEmployers: Int = 30000
    val numbersOfInterns: Int = 30
    val salaryInterns: Int = 20000

    val employersSalarySum: Int = numberOfEmployers * salaryEmployers
    val sumSalary: Int = numberOfEmployers * salaryEmployers + numbersOfInterns * salaryInterns
    val averageSalary: Int =
        ((numberOfEmployers * salaryEmployers) + (numbersOfInterns * salaryInterns)) / (numbersOfInterns + numberOfEmployers)

    println(employersSalarySum)
    println(sumSalary)
    println(averageSalary)
}
