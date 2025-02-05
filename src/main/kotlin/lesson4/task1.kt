package org.example.lesson4

fun main() {

    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${reservationToday < ALL_TABLES} \nДоступность столиков на завтра: ${reservationTomorrow < ALL_TABLES}")

}

const val ALL_TABLES = 13