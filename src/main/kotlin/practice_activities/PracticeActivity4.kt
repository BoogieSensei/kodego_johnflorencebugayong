package practice_activities

fun main(){
    //product information
    var productName : String = "Modem Router"
    var price : Double = 14500.50


    //discount computation
    var discount20 : Double = (price) * .20
    var discount15 : Double = (price) * .15
    var discount10 : Double = (price) * .10
    var discount5 : Double = (price) * .05
    var discount0 : Double = (price) * 1

    //Net Price
    var netPrice : Double = price - discount5


    println("Product Name: $productName")
    println("SRP of Modem Router: $price")

    //Discount Range
    if(price > 100000){
        println("Discount: $discount20")
        println("20% Discount")
    }else if((price <= 99999) && (price >= 50001)){
        println("Discount: $discount15")
        println("15% Discount")
    }else if((price <= 500000) && (price >=20001)){
        println("Disount: $discount10")
        println("10% Discount")
    }else if((price <= 20000) && (price >= 10001)){
        println("Discount: $discount5")
        println("5% Discount")
    }else if((price <= 10000) && (price >=0)) {
        println("Discount: $discount0")
        println("0% Discount")
    }else{
        println("Invalid Amount")
    }

    println("Net price: $netPrice")

}