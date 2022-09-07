fun main(){
    //Implicit declaration
    //                      0       1       2
    //array size = 3
    var names  = arrayOf("John","Paul","Mark")
    println(names[0])

    //explicit
    var numbers = arrayOf<Int>(2,3,10,12,9)
    println(numbers[4])

    //array size
    println(numbers.size)

}