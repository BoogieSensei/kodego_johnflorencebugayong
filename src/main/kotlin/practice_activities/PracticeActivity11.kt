package practice_activities

fun main(){
    println("Welcome to Paul & John's Tech Store!")

    println("Please enter the product name:")
    var declaredName: String = readln()


    println("Please enter the product price:")
    var declaredPrice : Double = readln().toDouble()

    var product = DiscountComputation(declaredName, declaredPrice)
    product.discountedPrice()



}

class DiscountComputation(var productName: String, var productPrice: Double){

    init{

        println("You have chosen to purchase a $productName, which has an initial price of $productPrice pesos.")
        println("******************")

    }

    fun discountedPrice(): Double{
        //discount computation
        var discount20 : Double = (productPrice) * .20
        var discount15 : Double = (productPrice) * .15
        var discount10 : Double = (productPrice) * .10
        var discount5 : Double = (productPrice) * .05
        var discount0 : Double = (productPrice)

        //Net Price
        var netPrice : Double = 0.0

        //Discount Range
        if(productPrice > 100000){
            println("Discount: $discount20")
            println("20% Discount")

        }else if((productPrice <= 99999) && (productPrice >= 50001)){
            println("Discount: $discount15")
            println("15% Discount")

        }else if((productPrice <= 500000) && (productPrice >=20001)){
            println("Disount: $discount10")
            println("10% Discount")

        }else if((productPrice <= 20000) && (productPrice >= 10001)){
            println("Discount: $discount5")
            println("5% Discount")

        }else if((productPrice <= 10000) && (productPrice >=0)) {
            println("Discount: 0")
            println("0% Discount")

        }else{
            println("Invalid Amount")
        }

        //netPrice computation
        //Discount Range
        if(productPrice > 100000){
            netPrice  = productPrice - discount20
            println("The net price of your $productName is $netPrice")

        }else if((productPrice <= 99999) && (productPrice >= 50001)){
            netPrice  = productPrice - discount15
            println("The net price of your $productName is $netPrice")

        }else if((productPrice <= 500000) && (productPrice >=20001)){
            netPrice  = productPrice - discount10
            println("The net price of your $productName is $netPrice")

        }else if((productPrice <= 20000) && (productPrice >= 10001)){
            netPrice  = productPrice - discount5
            println("The net price of your $productName is $netPrice")

        }else if((productPrice <= 10000) && (productPrice >=0)) {
            netPrice  = productPrice
            println("The net price of your $productName is $netPrice")

        }else{
            println("Invalid Amount")
        }
        return netPrice
    }

}