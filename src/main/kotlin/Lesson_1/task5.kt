package org.example.Lesson_1

fun main() {
    val secondsTotal = 6480
    val secondsInMinute = 60

    val minutesForCalculate = secondsTotal / secondsInMinute

    val secondsInSpace = secondsTotal % secondsInMinute
    val hoursInSpace = minutesForCalculate / secondsInMinute
    val minutesInSpace = minutesForCalculate % secondsInMinute

    print(checkZeroBefore(hoursInSpace) + ":" + checkZeroBefore(minutesInSpace) + ":" + checkZeroBefore(secondsInSpace))

}

fun checkZeroBefore(time: Int): String {
    if (time < 10) {
        return "0$time"
    } else {
        return time.toString()
    }
}

