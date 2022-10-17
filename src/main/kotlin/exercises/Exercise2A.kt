package exercises

fun main(){
    var listOfStudents = arrayOf(

        arrayOf<String>("John Smith","09089999994", "Brooklyn, New York"),
        arrayOf<String>("James Kennedy", "0908888887", "Nevada, Texas"),
        arrayOf<String>("Paul Cruz", "09081111112", "Los Angeles, California" )

    )
    println("Student Directory")
    println("***************")

    var row : Int = 0
    var column : Int = 0
    var ctr : Int = 1

    //list of names
    while (row < 3) {
        print(ctr)
        print(" ")
        println(listOfStudents[row][0])

        row++
        ctr++
    }


    //Accessing student info
    println("****************")

    println("Please enter the number of the student information you wish to access.")
    var input1 : Int = readln().toInt()

    while(column < 3){
        if(input1 == 1){
            println(listOfStudents[0][column])

            column++

        }else if(input1 == 2){
            println(listOfStudents[1][column])

            column++


        }else if(input1 == 3){
            println(listOfStudents[2][column])


            column++
        }
    }

    println("**************")
    println("Thank you for using our automated student directory. Have a good day!")




}