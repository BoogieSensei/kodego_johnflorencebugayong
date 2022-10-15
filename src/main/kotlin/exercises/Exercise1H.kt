package exercises

fun main() {
//    Activity 1H: Using Activity 01 - B and Implement a process where someone can borrow a book.

    //Book names
    var book1Name: String = "The Fox and The Hound"
    var book2Name: String = "Jack and the Beanstalk"
    var book3Name: String = "Alice in Wonderland"

    //mutableMapOf
    var map1 = mutableMapOf<Int, String>()
    map1.put(1, book1Name)
    map1.put(2, book2Name)
    map1.put(3, book3Name)


    //Book Availability
    var book1Copy: Int = 2
    var book2Copy: Int = 3
    var book3Copy: Int = 1

    //Book status
    var book1Stat: Boolean = book1Copy > 0
    var book2Stat: Boolean = book2Copy > 0
    var book3Stat: Boolean = book3Copy > 0

    //Start of Process
    var conditionMain : Boolean = true

    while(conditionMain) {
        println("Do you want to borrow a book?")
        var input1: String = readln().uppercase()

        if (input1 == "YES") {
            println("Here are the list of available books.")
            println(map1)
            println()
            println("Please enter the number of your preferred book")
            var chosenBook: Int = readln().toInt()

            if (chosenBook == 1) {
                println("You have chosen to borrow $book1Name")
            } else if (chosenBook == 2) {
                println("You have chosen to borrow $book2Name")
            } else if (chosenBook == 3) {
                println("You have chosen to borrow $book3Name")
            } else {
                println("Please enter a valid number.")
            }

            var condition: Boolean = true

            while (condition) {
                println("Do you want to borrow another book?")
                var input2: String = readln().uppercase()

                if (input2 == "YES") {
                    println("Here are the list of available books.")
                    println(map1)
                    println()
                    println("Please enter the number of your preferred book")
                    var chosenBook: Int = readln().toInt()

                    if (chosenBook == 1) {
                        println("You have chosen to borrow $book1Name")
                    } else if (chosenBook == 2) {
                        println("You have chosen to borrow $book2Name")
                    } else if (chosenBook == 3) {
                        println("You have chosen to borrow $book3Name")
                    } else {
                        println("Please enter a valid number.")
                    }
                } else if (input2 == "NO") {
                    condition = false
                }
            }
            conditionMain = false


        } else if (input1 == "NO") {
            conditionMain = false
        }else{
            println("Please answer either YES or NO")
        }

    }
    println("Thank you for visiting our bookstore. We hope to see you again")
}