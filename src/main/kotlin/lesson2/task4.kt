package org.example.lesson2

fun main(){

    val commonCrystal = 7
    val commonIron = 11

    val buffCrystal = commonCrystal * 0.2f
    val buffIron = commonIron * 0.2f

    println("Бонусные кристаллы " + buffCrystal.toInt())
    println("Бонусное железо " + buffIron.toInt())
}