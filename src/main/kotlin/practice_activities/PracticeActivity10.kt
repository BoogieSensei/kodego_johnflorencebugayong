package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)
//    phone.buyLoad(50.0)
//    println("Your current load is ${phone.load}")

//    phone.chargeBattery(0)
//    println("The current battery percentage is ${phone.batteryPercentage}%")
}


class SmartPhone(var load: Double, var batteryPercentage:Int) {
    init {
        println("Object Created!")
        println("Initial value of load is $load and battery percentage is $batteryPercentage%")
        println("***************")
    }

    //set parameter for functions
    /*  chargeBattery(percent) // does not accept 0 or negative values, should not exceed 100%
        sendText(message) // display message sent, load will decrement
        checkBalance() // display current load, if zero, display "Check operator services"
        call(minutes) // 8 load per minute, will not push through if no sufficient load
     */

    //Buying load function
    fun buyLoad(amount: Double): Double {
        if (amount > 0) {


            var newAmount = load + amount
            load = newAmount
            println("You have purchased $amount pesos load.")
            var condition = true
            while (condition) {
                println("Your current load is $load pesos")
                println("Do you want to add more load? YES or NO")
                var input = readln().uppercase()

                if (input == "YES") {
                    println("please enter another amount:")
                    var newAmount2: Double = readln().toDouble()
                    load = load + newAmount2
                } else if (input == "NO") {
                    condition = false

                } else {
                    println("You have entered an invalid answer.")
                }

            }
        }else{
            println("You have entered and invalid amount. Please try again.")
        }
        return load
    }


    //charge battery
    fun chargeBattery(chargePercentage: Int):Int{
        if(chargePercentage > 0){
        batteryPercentage = batteryPercentage + chargePercentage

            while(batteryPercentage > 100) {
            batteryPercentage = batteryPercentage - 5
            println(batteryPercentage)
            }

        }else{
            println("You have entered and invalid amount. Please try again.")
        }
    return batteryPercentage
    }


}