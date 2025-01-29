package org.example.lesson2

fun main(){

    val hoursStart = 9
    val minutesStart = 39
    val minutesOnRoad = 457

    var hoursEnd = hoursStart + minutesOnRoad / 60
    var minutesEnd = minutesStart + minutesOnRoad % 60

    hoursEnd += minutesEnd / 60
    minutesEnd %= 60

    print(hoursEnd)
    print(":")
    print(minutesEnd)

}