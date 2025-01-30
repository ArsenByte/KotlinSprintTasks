package org.example.lesson2

const val constForTime: Int = 60

fun main(){

    val hoursStart = 9
    val minutesStart = 39
    val minutesOnRoad = 457

    var hoursEnd = hoursStart + minutesOnRoad / constForTime
    var minutesEnd = minutesStart + minutesOnRoad % constForTime

    hoursEnd += minutesEnd / constForTime
    minutesEnd %= constForTime

    print(hoursEnd)
    print(":")
    print(minutesEnd)

}