package org.example.lesson2



fun main() {

    val deposit = 70000
    val years = 20
    val percentRate = 16.7

    val resultDeposit = deposit * Math.pow((1 + percentRate / 100), years.toDouble())

    println(String.format("%.3f", resultDeposit))

}