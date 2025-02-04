package org.example.lesson4

fun main() {

    val minLimitWeight = 35
    val maxLimitWeight = 100
    val maxLimitVolume = 100

    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeight и объёмом $firstCargoVolume соответствует категории \"Average\": ${firstCargoWeight > minLimitWeight && firstCargoWeight <= maxLimitWeight && firstCargoVolume < maxLimitVolume}")
    println("Груз с весом $secondCargoWeight и объёмом $secondCargoVolume соответствует категории \"Average\": ${secondCargoWeight > minLimitWeight && secondCargoWeight <= maxLimitWeight && secondCargoVolume < maxLimitVolume}")

}