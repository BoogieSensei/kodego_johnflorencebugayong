package practice_activities

/*
1. Practice Activity 9
2. Create a MobilePhone class
3. Give at least 5 attributes
4. Give at least 5 behaviors
5. Create 1 primary
6. Create 2 secondary constructors
 */


fun main(){
    var myPhone = MobilePhone("Reno2", "Oppo", "White", 20000, 10)
        myPhone.phoneName = "Vivo5"
        myPhone.displayName()
        myPhone.displayBrand()
        myPhone.displayColor()
        myPhone.phonePrice = 50000
        myPhone.displayPrice()
        myPhone.displayStock()


}
    //Attributes
class MobilePhone(var phoneName: String, var brandName: String, var phoneColor: String, var phonePrice: Int, var phoneStock: Int){


    init{
        println("Showing phone features:")

    }

    // secondary constructors
    constructor(name: String):this(name,"default", "default", 0,0 )
    constructor(price: Int):this("default","default", "default", price,0 )



    //Behavior
    fun displayName(){
        println("The phone is called $phoneName")
    }

    fun displayBrand(){
        println("It is an $brandName brand.")
    }

    fun displayColor(){
        println("The phone is available in $phoneColor")
    }

    fun displayPrice(){
        println("The phone price is $phonePrice")
    }

    fun displayStock(){
        println("There is currently $phoneStock stocks available")
    }


}
