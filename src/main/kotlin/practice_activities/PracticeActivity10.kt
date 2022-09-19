package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)
//    phone.buyLoad(50.0)

//    phone.chargeBattery(25)

//    phone.sendText("Hello World!")

//    phone.checkBalance()

//    phone.call(8)

}


class SmartPhone(var load: Double, var batteryPercentage:Int) {
    init {
        println("Object Created!")
        println("Initial value of load is $load and battery percentage is $batteryPercentage%")
        println("***************")
    }

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
        println("Your current load is $load")
        return load
    }


    //charge battery
    fun chargeBattery(chargePercentage: Int):Int{
        if(chargePercentage > 0){

            println("Charging....")
            var ctr1 : Int = 0
            while((batteryPercentage < 100) && (ctr1 < chargePercentage)) {

                batteryPercentage = batteryPercentage + 1
                println(batteryPercentage)

                ctr1++
                }

        }else{
            println("You have entered and invalid amount. Please try again.")
        }
        println("The current battery percentage is $batteryPercentage%")
    return batteryPercentage
    }


    // send text with load decrement
    fun sendText(message: String){
        println(message)
        load = load - (message.length * 0.02)
        println("load was deducted per character used in the message. Current load is $load pesos")

    }


    fun checkBalance(){
        if(load > 0 ){
            println("Your current load is $load")

        }else{
            println("check operator services.")
        }
    }

    fun call(minutes: Int) {

        if (load > 8) {

            var ctr1: Int = 0
            while ((ctr1 < minutes) && (load > 8)) {

                var costPerMinute: Double = 8.0
                load = load - costPerMinute

                ctr1++
            }
            println("Remaining load: $load.")
            println("Total call duration: $ctr1 minutes.")

        }else{
            println("Insufficient Balance.")
        }
    }
}