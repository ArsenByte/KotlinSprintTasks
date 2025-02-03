package org.example.Lesson_1

fun main() {
    val secondsTotal = 6480
    val secondsInMinute = 60

    val minutesForCalculate = secondsTotal / secondsInMinute

    val secondsInSpace = secondsTotal % secondsInMinute
    val hoursInSpace = minutesForCalculate / secondsInMinute
    val minutesInSpace = minutesForCalculate % secondsInMinute

    print(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace))
}



