package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main(){

    val hoursStart = 9
    val minutesStart = 39
    val minutesOnRoad = 457

    var hoursEnd = hoursStart + minutesOnRoad / MINUTES_IN_HOUR
    var minutesEnd = minutesStart + minutesOnRoad % MINUTES_IN_HOUR

    hoursEnd += minutesEnd / MINUTES_IN_HOUR
    minutesEnd %= MINUTES_IN_HOUR

    print(hoursEnd)
    print(":")
    print(minutesEnd)

}