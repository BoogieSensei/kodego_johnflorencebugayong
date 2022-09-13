fun main (){
//    var num1 : Int = readln().toInt()

//    println(total(2,4,5,5))
    var numbers = arrayListOf<Int>()

//    for (i in 0..2){
//        println("Enter number $i")
//        var input : Int = readln().toInt()
//        numbers[i] = input
    }

//    println(total2(2,4,6,8,9,10,7))


}

fun total(num1:Int, num2: Int, num3: Int, num4: Int):Int{
    return num1 + num2 + num3 + num4
}

fun total2(vararg numbers :Int):Int{
    var sumOfALLNumbers: Int = 0;
    for(num in numbers){
        sumOfALLNumbers = sumOfALLNumbers + num
    }
    return sumOfALLNumbers
}