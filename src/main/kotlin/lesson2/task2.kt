package org.example.lesson2

fun main(){

    val countOfEmployees = 50
    val salaryOfEmployees = 30000
    val countOfTrainee = 30
    val salaryOfTrainee = 20000

    val payoutOfEmployees = countOfEmployees * salaryOfEmployees
    val payoutTotal = countOfTrainee * salaryOfTrainee + payoutOfEmployees
    val payoutAverage = payoutTotal / (countOfTrainee + countOfEmployees)

    println(payoutOfEmployees)
    println(payoutTotal)
    println(payoutAverage)
}