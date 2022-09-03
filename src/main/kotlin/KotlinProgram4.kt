fun main () {

    var number : Int = 10

    if(number < 10) {
        println("Hello)")
    }

    var grades : Int = 74

    if((grades >=96) && (grades <=100)) {
        println("1.00")
    }
    else if((grades >=86) && (grades <=95)){
        println("1.75")
    }
    else if ((grades >= 76) && (grades <=85)) {
        println("2.25")
    }
    else if(grades < 75){
        println("5.0")
    }else{
        println("Invalid grade!")
    }



    var gender : String = "M"

    if(gender == "M"){
        println("Male")
    } else if (gender == "F"){
        println("Female")
    }else{
        println("Invalid choice")
    }


//    //range
//    var idNumber : Int = 1
//    //true                 //true
//    if((idNumber >= 1) && (idNumber<=3)){
//        println("Valid ID number")
//        println("Success")
//    }


    println("Line Ends")

}