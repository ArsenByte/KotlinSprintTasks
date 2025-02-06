package org.example.lesson4

fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "winter"

    val checkConditions = (isSunny == SUNNY_CONDITION) && (isTentOpen == TENT_CONDITION) &&
            (airHumidity == HUMIDITY_CONDITION) && (currentSeason != SEASON_WRONG_CONDITION)

    println("Благоприятные ли условия сейчас для роста бобовых? $checkConditions ")

}

const val SUNNY_CONDITION = true
const val TENT_CONDITION = true
const val HUMIDITY_CONDITION = 20
const val SEASON_WRONG_CONDITION = "winter"
