package exercises

fun main(){

    /*
    Author: John Florence E. Bugayong
    Date Created: 9/3/2022
    Filename: Exercise 1-D
     */


    var amountInitial : Double = 100.00



    println("please enter amount")
    var amount1 : Double = readln().toDouble()

    if ((amount1 >=1) && (amount1 <= 1000000000000)){
     println("The amount your entered is $amount1.")
    }
    println("Do you want to add another amount? Please answer either YES or NO")
    var amount2: String = readln().toString()

    if(amount2 == "YES") {
            println("Please enter additional amount.")
    var amount3 : Double = readln().toDouble()
        var totalAmount1 : Double = amount1 + amount3
        println("The total amount you enter is $totalAmount1")
        println("Divide the value by how many?")
        var divisor1 : Int = readln().toInt()
        var grandTotal1 : Double = totalAmount1 / divisor1
        println("Your total amount is $grandTotal1")
    }else if(amount2 == "NO"){
        println("Divide the value by how many?")
        var divisor2 : Int = readln().toInt()
        var grandTotal2 : Double = amount1 / divisor2
        println("Your total amount is $grandTotal2")
    }

    println("Thank you so much for your transaction. We hope to business with you again.")

}