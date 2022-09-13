package exercises


fun main () {

    /*
    Author: John Florence E. Bugayong
    Date Created: 9/4/2022
    Filename: Exercise1E.kt

    Create an application that will accept 2 string inputs.
    Your application will print all unique characters in both Strings.
     */


    var str1: String = "123456"
    var str2: String = "456789"
    var uniqueString1 : String = ""
    var uniqueString2 : String = ""

    var ctr1 : Int = 0
    while(ctr1 < str1.length){
        var ctr2 : Int = 0
        var countDuplicate :Int = 0
        while((ctr2 < str2.length) && (countDuplicate == 0)){
            if((str1[ctr1]) == str2[ctr2]){
                countDuplicate++
            }
            ctr2++
        }
        if(countDuplicate == 0) {
            if(!uniqueString1.contains(str1[ctr1])){
                uniqueString1 += str1[ctr1]
            }
        }
        ctr1++
    }
    var ctr2 : Int = 0
    while (ctr2 < str2.length){
        var ctr1 : Int = 0
        var countDuplicate = 0
        while((ctr1 < str1.length) && (countDuplicate == 0)){
            if(str2[ctr2] == str1[ctr1]){
                countDuplicate++
            }
            ctr1++
        }
        if(countDuplicate == 0){
            if(!uniqueString2.contains(str2[ctr2])){
                uniqueString2 += str2[ctr2]
            }

        }
        ctr2++
    }

    println(uniqueString1)
    println(uniqueString2)




}