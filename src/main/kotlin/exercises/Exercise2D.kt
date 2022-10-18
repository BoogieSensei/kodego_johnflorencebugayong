package exercises

fun main(){
    var myATM = BankATM(1000.00)
    myATM.withdrawMoney(100.00)




}



class BankATM (var amount : Double) {

    init {
        println("Welcome to Boogie's ATM.")
        println("**************")
    }


    fun withdrawMoney(withdraw: Double): Double {
        if (withdraw > 0) {


            var toWithdraw = withdraw
            amount = amount - toWithdraw

            println("You want to draw $withdraw pesos in your savings account.")
            var condition = true

            //Withdraw additional amount
            while ((amount > 0) && (condition)) {
                println("Do you want to withdraw another amount? YES or NO")
                var input: String = readln().uppercase()

                if ((input == "YES") && (amount > -1) && (toWithdraw < amount)) {
                    print("Enter Amount:")
                    var newWithdrawal: Double = readln().toDouble()
                    toWithdraw = toWithdraw + newWithdrawal

                    println("The total amount you entered is $toWithdraw")
                    println("Remaining balance: $amount")


                } else if ((input == "NO") && (toWithdraw > amount)) {
                    condition = false

                }else{
                    println("Please enter either YES or NO")
                }

            }
            amount = amount - toWithdraw

            println("The total amount you entered is $toWithdraw")

            println("Divide the total value by how many?")
            var divisor: Int = readln().toInt()

            var totalAmount: Double = toWithdraw / divisor
            println("You will receive $totalAmount pieces of $divisor pesos")
            println("Your remaining balance is $amount pesos.")
        }
        println("Thank you so much for your patronage. We hope we can always be of service to you. Good day!")
        return amount
    }
}