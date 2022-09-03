package exercises

fun main (){

    //Food Name
    var foodName1 : String = "Bananas"
    var foodName2 : String = "Eggs"
    var foodName3 : String = "Milk"

    //Food Type
    var foodType1 : String = "Dairy"
    var foodType2 : String = "Fruit"
    var foodType3 : String = "Vegetable"

    //Food Price in PHP per Kilo
    var foodPrice1 : Double = 60.00
    var foodPrice2 : Double = 115.00
    var foodPrice3 : Double = 80.00

    //Food Inventory
    var foodStock1 : Int = 5
    var foodStock2 : Int = 10
    var foodStock3 : Int = 0

    //Availability
    var food1 : Boolean = foodStock1 > 0
    var food2 : Boolean = foodStock2 > 0
    var food3 : Boolean = foodStock3 > 0

    //total amounts
    var total1 : Double = foodPrice1 * foodStock1
    var total2: Double = foodPrice2 * foodStock2
    var total3: Double = foodPrice3 * foodStock3

    println("The $foodName1 are worth $foodPrice1 pesos per kilo and there are $foodStock1 kilos available.")
    println("With a total amout of $total1 pesos. ")
    println(food1)





}