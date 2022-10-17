package exercises

fun main(){
    //Implement Activity 01 - C using data structure.

    var groceryItems = mapOf(1 to "Fruits", 2 to "Vegetable", 3 to "Meat")

    var listOfFruits = mapOf(1 to "Mangoes",2 to "Bananas",3 to "Apples")
    var listOfVegetables = mapOf(1 to "Potatoes",2 to "Cucumbers",3 to "Lettuce")
    var listOfMeat = mapOf(1 to "Chicken",2 to "Beef", 3 to "Fish")


    println("Welcome to Boogie's Grocery Store")
    println("*****************")


    println(groceryItems)

    var condition :Boolean = true
    while(condition) {
        println("Please choose number of the item you wish to purchase:")
        var input1: Int = readln().toInt()




        if (input1 == 1) {
            for (value1 in listOfFruits) {
                println(value1)
            }

            var condition2 :Boolean = true
            while (condition2){
            println("Which fruit would you like to purchase?")
            var input2: Int = readln().toInt()

            if (input2 == 1) {
                print("You have chosen to buy ")
                println(listOfFruits[1])
            } else if (input2 == 2) {
                print("You have chosen to buy ")
                println(listOfFruits[2])
            } else if (input2 == 3) {
                print("You have chosen to buy ")
                println(listOfFruits[3])
            } else {
                println("please choose a valid number")
            }
            condition2 = false
        }


        }else if(input1 == 2){
            for (value2 in listOfVegetables){
                println(value2)
            }
            var condition3 : Boolean = true
            while(condition3){
                println("Which fruit would you like to purchase?")
                var input2: Int = readln().toInt()

                if (input2 == 1) {
                    print("You have chosen to buy ")
                    println(listOfFruits[1])
                } else if (input2 == 2) {
                    print("You have chosen to buy ")
                    println(listOfFruits[2])
                } else if (input2 == 3) {
                    print("You have chosen to buy ")
                    println(listOfFruits[3])
                } else {
                    println("please choose a valid number")
                }
                condition3 = false
            }
        }else if(input1 == 3){
            for(value3 in listOfMeat) {
                println(value3)
            }
            var condition4 : Boolean = true
            while(condition4){
                println("Which fruit would you like to purchase?")
                var input2: Int = readln().toInt()

                if (input2 == 1) {
                    print("You have chosen to buy ")
                    println(listOfFruits[1])
                } else if (input2 == 2) {
                    print("You have chosen to buy ")
                    println(listOfFruits[2])
                } else if (input2 == 3) {
                    print("You have chosen to buy ")
                    println(listOfFruits[3])
                } else {
                    println("please choose a valid number")
                }
                condition4 = false
            }
        }else{
            println("please enter a valid number")
        }

        println("Do you wish to buy more items?")
        var input3 : String = readln().uppercase()
        if (input3 == "YES"){
            println()
        }else if(input3 == "NO"){
            condition = false
        }else{
            println("Please answer either YES or NO")
        }


    }
    println("Your order will be delivered shortly. We hope to see you again")

}