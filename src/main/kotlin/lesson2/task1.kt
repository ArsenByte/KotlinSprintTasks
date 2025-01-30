package org.example.lesson2

fun main() {

    val numberOfStudents = 4
    val markOfStudent1 = 3
    val markOfStudent2 = 4
    val markOfStudent3 = 3
    val markOfStudent4 = 5

    val averageResult = (markOfStudent1 + markOfStudent2 + markOfStudent3 + markOfStudent4) / numberOfStudents.toFloat()

    println(averageResult)
}