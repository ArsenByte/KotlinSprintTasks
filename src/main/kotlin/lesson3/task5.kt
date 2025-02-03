package org.example.lesson3

fun main(){

    val exampleMove = "D2-D4;0"

    val parsingMovesNumbers = exampleMove.split(";")
    val allMoves = parsingMovesNumbers[0].split("-")

    val countOfMoves = parsingMovesNumbers[1]
    val startMove = allMoves[0]
    val endMove = allMoves[1]

    println(startMove)
    println(endMove)
    println(countOfMoves)
}