package org.example.lesson4

fun main() {

    val dayOfTraining = 6
    val checkEven = dayOfTraining % 2 == 1

    print(
        """ 
        Упражнения для рук: $checkEven
        Упражнения для ног:  ${!checkEven}     
        Упражнения для спины:  ${!checkEven}
        Упражнения для пресса: $checkEven
    """.trimIndent()
    )

}