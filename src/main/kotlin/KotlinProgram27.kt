fun main (){
    var anne = Person("Anne")
    anne. age = 25
    anne.displayAge()
}

            //constructor()
class Person(var name: String, var age: Int){ //primary constructor

    init{
        println("Object Created!")
        println("name is $name")
        println("age is $age")
    }

     //secondary constructor
     constructor(name:String):this(name,0){}
     constructor(age:Int):this("deafult_name", age){}


    fun walk(){
        println("A person walks")

    }
    fun eat(){
        println("A person eats")
    }
    fun displayAge(){
        //var age : Int = 7
        println(age)
    }
    fun ageUp(){
        age++
    }

}