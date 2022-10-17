fun main(){

    var numbers = intArrayOf(0,0,0)

    for (i in 0..2) {
        println("Enter number ${i+1}")
        var input: Int = readln().toInt()
        numbers[i] = input
    }
    println(total(*numbers))
}

fun total(vararg numbers :Int):Int{
    var sumOfALLNumbers: Int = 0;
    for(num in numbers){
        sumOfALLNumbers = sumOfALLNumbers + num
    }
    return sumOfALLNumbers
}