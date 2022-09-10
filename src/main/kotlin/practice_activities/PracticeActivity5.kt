package practice_activities

fun main(){

    //Enter number 1: >>1
    //Enter number 2: >>2
    //Enter number 3: >>3
    //Enter number 4: >>4
    //Enter number 5: >>5
    //[1, 2, 3, 4, 5]
    //[5, 4, 3, 2, 1]

    var array = arrayOf<Int>(1,2,3,4,5)
    var ctr : Int = 0


    while(ctr < array.size){
        println("Enter the new value for index $ctr :")
        array[ctr] = readln().toInt()

       ctr++

    }
    var ctr2 : Int = 0
    while(ctr2 < array.size){
        print(array[ctr2])

        ctr2 ++
    }
    println()
    var ctr3 = array.size -1
    while(ctr3 >= 0 ){

        print(array[ctr3])

        ctr3--
    }






//    var str : String = "Hello"
//    var str2 : String = "Hi"
//    var ctr : Int = 0
//    while (ctr < str.length){
//        str2.contains(str[ctr])
//        println(str[ctr])
//        ctr++
//    }


}