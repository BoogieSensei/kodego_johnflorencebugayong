fun main(){

    //Loop within a loop or Nested Loop
    var ctr1 : Int = 1
    while(ctr1 <=3){
        //start of inner loop
        var ctr2 : Int = 1
        while (ctr2 <=3){
            print("@")//@@@@@
            ctr2++
        }
        //end of inner loop
        println() //empty next line
        ctr1++
    }


}