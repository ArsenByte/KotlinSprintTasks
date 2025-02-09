package org.example.lesson3

fun main(){

    val exampleMove = "D2-D4;0"

    val parsingMovesNumbers = exampleMove.split(";", "-")

    val startMove = parsingMovesNumbers[0]
    val endMove = parsingMovesNumbers[1]
    val countOfMoves = parsingMovesNumbers[2]

    println(startMove)
    println(endMove)
    println(countOfMoves)
}