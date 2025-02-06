package org.example.lesson5

fun main() {

    val firstNumber = 10
    val secondNumber = 5
    val resultNumber = firstNumber * secondNumber

    println("Решите задачу:  $firstNumber * $secondNumber = ")

    val clientNumber = readln().toInt()

    if (clientNumber == resultNumber){
        print("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}