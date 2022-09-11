package practice_activities

fun main(){
    var length : Double = 4.5
    var width : Double = 2.0

    var perimeter: Double = calculatePerimeter(length,width)
    println(perimeter)
    var area: Double = calculateArea(length,width)
    println(area)


}

fun calculatePerimeter( length: Double, width: Double):Double{
    return (length + width)*2

}

fun calculateArea(length: Double, width:Double):Double{
    return length * width
}