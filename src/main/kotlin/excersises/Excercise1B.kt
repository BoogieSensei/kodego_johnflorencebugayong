package excersises


fun main () {

    //Book names
    var book1Name : String = "The Fox and The Hound"
    var book2Name : String = "Jack and the Beanstalk"
    var book3Name : String = "Alice in Wonderland"

    //Book Availability
    var book1Copy : Int = 2
    var book2Copy : Int = 3
    var book3Copy : Int = 0

    //Book status
    var book1Stat : Boolean = book1Copy > 0
    var book2Stat : Boolean = book2Copy > 0
    var book3Stat : Boolean = book3Copy > 0

    println("$book1Name is currently available. $book1Stat")

    println("$book2Name is currently available. $book2Stat")

    println("$book3Name is currently available. $book3Stat")



}