fun main() {
    val a: Int = 1 // assignation de variable constante en int
    // impossible reassigment a = 4
    println("variable constante a = $a")
    val b = 1 // init du int dans specifier le type
    println("variable constante b = $b")
    val c: Int
    c = 4
    println("variable constante c = $c")
    var x = 4 // variable qui peut etre change plutard
    println("variable x = $x")
    x = 5 // reassignement
    println("variable x = $x")
    x += 1 // incrementation possible uniqument comme en python
    print("variable incrementer de plus 1 x = $x")
}
