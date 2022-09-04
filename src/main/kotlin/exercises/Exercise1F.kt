package exercises


fun main(){

    /*
    Author: John Florence E. Bugayong
    Date Created: 9/4/2022
    Filename: Exercise1F.kt
     */

    println("Please enter a PALINDROME:")
    var answer1 : String = readln().toString()

    //Google is your friend!!!!
    var answer2 = answer1.reversed()

    println(answer2)

    //condition
    if((answer1) == (answer2)){
        println("Your answer is a PALINDROME")
    }else{
        println("Your answer is not a Palindrome.")
    }


    println("Thank you for playing.")




}