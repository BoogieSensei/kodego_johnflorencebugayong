fun main(){
    println("Enter your name")
    var name : String = readln()

    println("Enter your age")
    var age : Int = readln().toInt()

    displayNameAndAge(name,age)

}

//no return no parameter
fun displayName(): Unit {
    println("Peter")

}

//no return with 1 parameter
fun displayMessage (msg: String){
    println("The message is \"$msg\"")
}

//no return with 2 parameters
fun displayNameAndAge (name: String, age: Int) {
    println("Your name is $name")
    println("Your age is $age")



}