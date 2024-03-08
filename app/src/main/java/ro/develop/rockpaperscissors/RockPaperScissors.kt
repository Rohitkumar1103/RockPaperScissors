package ro.develop.rockpaperscissors

import android.opengl.GLES31Ext.DebugProcKHR

fun main() {

    var computerChoice = ""
    var userChoice = ""

    while (true) {
        println("Rock, Paper, Scissor? Enter your Choice! : ")
        userChoice = readln()

        //if (userChoice == "Rock" || userChoice == "Paper" || userChoice=="Scissor")
        if (userChoice in listOf("Rock", "Paper", "Scissor")) {
            break // Valid choice, exit the loop
        } else {
            println("Invalid choice. Please enter Rock, Paper, or Scissor.")
        }
    }

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"

        }

        2 -> {
            computerChoice = "Paper"
        }

        3 -> {
            computerChoice = "Scissor"
        }
    }

    println(computerChoice)

    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "Rock" && computerChoice == "Scissor" -> "User"
        userChoice == "Paper" && computerChoice == "Rock" -> "User"
        userChoice == "Scissor" && computerChoice == "Paper" -> "User"
        else -> "Computer"
    }

    if(winner == "Tie") {
        println("It's a tie")
    }
//    else if(winner == "User"){
//        println("User Won!")
//    }else{
//        println("Computer Won")
//    }
    else {
        println("$winner Won!")
    }

}