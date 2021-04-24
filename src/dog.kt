class Dog(var name: String, weight_param:Int, breed_param:String = "Mixed") {
    var breed = breed_param.toUpperCase()

    init {
        println("Dog $name has been created.")
    }
    val activities = arrayOf("Run", "Jump", "Swim")
    init {
        println("Dog can ${activities[0]}")
    }

    val weightInKgs: Double
        get() = weight / 2.2

    var weight = weight_param
        set(value){
            if (value > 0) field = value
            else println("Incorrect weight")
        }

    fun bark():String {
        return (if (weight < 20) "Yip!" else "Woof!")

    }
}