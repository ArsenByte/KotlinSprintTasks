package org.example.lesson5

fun main() {

    val currentYear = 2025
    val yearOfBirthUser = readln().toInt()

    val ageOfUser = currentYear - yearOfBirthUser

    if (ageOfUser >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }

}

const val AGE_OF_MAJORITY = 18