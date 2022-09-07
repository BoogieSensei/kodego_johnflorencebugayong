fun main () {

    /*
    Author: John Florence E. Bugayong
    Date Created: 9/3/2022
    Filename: Exercise 1-D
     */

    //Start of the program

    println("Please Enter Amount:")
    var num1: Int = readln().toInt()
    var condition: Boolean = true

    while (condition) {
        println("Do you want to add another amount? YES or NO?")
        var input2: String = readln().toString()


        if (input2 == "YES") {
            print("Enter Amount:")
            var input: Int = readln().toInt()
            num1 = num1 + input
            println()
            println("The total amount you entered is $num1")

        } else if (input2 == "NO") {
            println("The total value you entered is $num1")

            println("Divide the total value by how many?")
            var divisor: Int = readln().toInt()

            var totalAmount: Int = num1 / divisor
            println("The total amount is $totalAmount")

            condition = false
        }

    }
    println()
    println("Thank you so much for you transaction. We hope to see you again.")
}

