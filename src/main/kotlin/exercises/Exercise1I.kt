package exercises

fun main (){
//    Using Activity 01 - C and implement a process where items are added to the grocery.

    var groceryItems = arrayListOf<String>()


    println("*Welcome to Boogie's Grocery Store inventory system*")
    var conditionMain : Boolean = true
    while(conditionMain) {
        println("Do you want to update the stores inventory?")
        var input1 : String = readln().uppercase()

        if (input1 == "YES") {
            println("Please enter the the items you wish to add to the inventory:")
            var newGroceryItems: String = readln()
            groceryItems.add(newGroceryItems)
            print("You added ")
            for(items in groceryItems) {
                print(" $items ")
            }
            print(" to the grocery inventory. ")

            var condition: Boolean = true
            while (condition) {
                println("Do you wish to add more items?")
                var input2: String = readln().uppercase()

                if (input2 == "YES") {
                    println("Please enter the the items you wish to add to the inventory:")
                    var newGroceryItems: String = readln().uppercase()
                    groceryItems.add(newGroceryItems)

                    print("You added ")
                    for(items in groceryItems) {
                        print(" $items ")
                    }
                    print(" to the grocery inventory. ")
                } else if (input2 == "NO") {
                    condition = false
                } else {
                    println("Please answer either YES or NO.")
                }
            }
            conditionMain=false

        } else if (input1 == "NO") {
            conditionMain = false
        } else {
            println("Please answer either YES or NO.")
        }

    }

    println("Thank you for using our inventory system. We hope to see you again.")
}

