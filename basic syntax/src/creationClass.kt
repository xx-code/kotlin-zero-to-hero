// open permet de rendre la classe heritable par d'autre class
open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun main() {
    val rectangle = Rectangle(5.1, 2.6)
    println("The perimeter is ${rectangle.perimeter}")
}