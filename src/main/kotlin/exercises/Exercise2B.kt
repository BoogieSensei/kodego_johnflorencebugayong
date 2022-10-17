package exercises

fun main (){
    //Implement Activity 01 -  B using data structure.

    var listOfBooks = arrayOf(
        arrayOf<String>("The Fox and The Hound","10 copies available", "Hard-Bound"),
        arrayOf<String>("Jack and the Beanstalk", "5 copies available", "Soft-Bound"),
        arrayOf<String>("Alice in Wonderland", "0 copies available", "Hard-Bound")


    )

    println("Welcome to Boogie's Online Bookstore")
    println("*********************")

    var row : Int = 0
    var column : Int = 0
    var ctr : Int = 1

    //List of Books
    while (row < 3) {
        print(ctr)
        print(" ")
        println(listOfBooks[row][0])

        row++
        ctr++
    }

    println("Please enter the number of the book you wish to access.")
    var input1 : Int = readln().toInt()

    while(column < 3){
        if(input1 == 1){
            println(listOfBooks[0][column])

            column++

        }else if(input1 == 2){
            println(listOfBooks[1][column])

            column++


        }else if(input1 == 3){
            println(listOfBooks[2][column])


            column++
        }
    }

    println("**************")
    println("Thank you for visiting Boogie's Online Bookstore. Have a good day!")



}