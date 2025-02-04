package org.example.lesson4

fun main() {

    val weatherIsSunny = true
    val tentIsOpen = true
    val airHumidity = 20
    val currentSeason = "winter"

    println("“Благоприятные ли условия сейчас для роста бобовых? ${weatherIsSunny && tentIsOpen && airHumidity == 20 && currentSeason != "winter"}")

}