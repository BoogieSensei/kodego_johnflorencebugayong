package practice_activities

fun main (){

    var age : Int = 24

    if(age >= 60 ) {
        println("Senior")
    }else if((age <=59) && (age >=31)) {
        println("Adult")
    }else if((age <=30) && (age >=18)){
        println("Young Adult")
    }else if((age <=17) && (age >=1)){
        println("Under Age")
    }else{
        println("Invalid Age")
    }

    println("Age Group")
}