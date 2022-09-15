fun main(){
    var myCar = Car()
    myCar.modelName = "BMW"
    println(myCar.modelName)
    myCar.fuelVolume = 100
    println(myCar.fuelVolume)

}


class Car{
    var modelName : String = ""
        get() = field
        set(value){
            field = value
        }

    var fuelVolume: Int = 0
        get() = field
        set(value){
            if(value < 0){
                println("invalid value")
            }else{
                field = value
            }

        }

    init{
        println("Object Created!")
        println("model name is $modelName")
        println("fuel volume is $fuelVolume")
    }

    fun accelerate(fuelVolume:Int){
        this.fuelVolume = this.fuelVolume - fuelVolume
    }
    fun checkFuel(){
        println("Current fuel volume is $fuelVolume")

    }

}