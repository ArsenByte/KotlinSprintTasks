package org.example.lesson4

fun main() {

    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    val checkFirstCargo =  (firstCargoWeight > MIN_LIMIT_WEIGHT) && (firstCargoWeight <= MAX_LIMIT_WEIGHT) && (firstCargoVolume < MAX_LIMIT_VOLUME)
    val checkSecondCargo = (secondCargoWeight > MIN_LIMIT_WEIGHT) && (secondCargoWeight <= MAX_LIMIT_WEIGHT) && (secondCargoVolume < MAX_LIMIT_VOLUME)

    println("Груз с весом $firstCargoWeight и объёмом $firstCargoVolume соответствует категории \"Average\": $checkFirstCargo")
    println("Груз с весом $secondCargoWeight и объёмом $secondCargoVolume соответствует категории \"Average\": $checkSecondCargo")

}

const val MIN_LIMIT_WEIGHT = 35
const val MAX_LIMIT_WEIGHT = 100
const val MAX_LIMIT_VOLUME = 100