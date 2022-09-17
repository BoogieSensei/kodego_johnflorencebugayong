fun main(){
    val name : String = "Jack"
    var age : Int = 12

}


class Empty{}

class Outer {

    val name ="Outer"
    fun show()= "The name : $name"

    class Nested {
        val name ="Nested"
        fun show()= "the name: $name"

    }
}

class Outer2{

    val name1 ="Outer2"
    fun show()= "The name : $name1"

    inner class Inner {
        val name2 ="Inner"
        fun show()= "data: $name2 and $name1"

    }
}