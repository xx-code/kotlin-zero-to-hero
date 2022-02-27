fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else if (a == b) {
        println("Same element")
        return a
    } else {
        return b
    }
}

fun main() {
    println("max of 4 and 5 is ${maxOf(4, 5)}")
}

