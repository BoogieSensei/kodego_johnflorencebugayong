package practice_activities

fun main(){
    println("Enter String:")
    var input : String = readln()
    palindromeChecker(input)

}

fun palindromeChecker(input:String){
    var input2 = input.reversed()

    if((input) == (input2)){
        println("Your answer is a PALINDROME")
    }else {
        println("Your answer is not a Palindrome.")
    }

}