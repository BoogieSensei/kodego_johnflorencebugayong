fun main (){

    var mySet = setOf(2,3,6,1,2,2,2,2,2,2)

//    println(mySet.count())
//    println(mySet.sum())
//    println(mySet.average())
//
//    for (data in mySet){
//        print(data)
//    }

    var setA = setOf(2,5,7,8)
    var setB = setOf(1,3,5,7)


    println(setA.union(setB))
    println(setA.intersect(setB))
    println(setA.minus(setB))
    println(setB.minus(setA))

}