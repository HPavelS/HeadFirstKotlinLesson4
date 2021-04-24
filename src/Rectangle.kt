class Rectangle(var width: Int = 1, var height: Int = 1) {
    val isSquare: Boolean
        get() = (width==height)
    val area:Int
        get() = (width*height)
}