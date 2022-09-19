package practice_activities

fun main(){

    var phone = SmartPhone(20.0, 50)
    phone.buyLoad(50.0)
    println(phone.load)




}


class SmartPhone(var load: Double, var batteryPercentage:Int) {
    init {
        println("Object Created!")
        println("Initial value of load is $load and battery percentage is $batteryPercentage%")
    }

    //set parameter for functions
    /* buyLoad(amount) // does not accept 0 or negative value
        chargeBattery(percent) // does not accept 0 or negative values, should not exceed 100%
        sendText(message) // display message sent, load will decrement
        checkBalance() // display current load, if zero, display "Check operator services"
        call(minutes) // 8 load per minute, will not push through if no sufficient load
     */

    fun buyLoad(amount: Double): Double {

        if (amount > 0) {
            var newAmount = load + amount
            this.load = newAmount
            println("You have purchased $amount pesos load.")
            var condition = true
            while (condition) {
                println("Your current load is $load pesos")
                println("Do you want to add more load? YES or NO")
                var input = readln().uppercase()
                var condition2 = true
                while (condition2) {
                    if (input == "YES") {
                        println("please enter another amount")
                        var newAmount2: Double = readln().toDouble()
                        load = load + newAmount2
                    } else if (input == "NO") {
                        condition2 = false

                    } else {
                        println("You have entered an invalid amount.")
                        condition2 = false
                    }
                }
                condition = false
            }
        }else{
            println("You have entered an invalid amount. Please try again. Have a nice day")
        }
        return load
    }
}