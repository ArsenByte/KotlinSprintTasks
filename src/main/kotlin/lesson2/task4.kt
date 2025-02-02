package org.example.lesson2

fun main() {

    val commonCrystal = 7
    val commonIron = 11
    val buffPercent = 20

    val buffPercentDecimal = buffPercent / 100f
    val buffCrystal = commonCrystal * buffPercentDecimal
    val buffIron = commonIron * buffPercentDecimal

    println("Бонусные кристаллы " + buffCrystal.toInt())
    println("Бонусное железо " + buffIron.toInt())
}