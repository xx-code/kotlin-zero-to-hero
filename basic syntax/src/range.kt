fun main() {
    val x = 10
    val y = 9

    if (x in 1..y+1) {
        println("Fits in range")
    }

    println("Other")
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
    println("Iterate in in")
    for (x in 1..5) {
        print(x)
        print(" ")
    }
    println("")
    println("pouvoir depasse les iterations")
    for (x in 9 downTo 0 step 3) {
        print(x)
        print(" ")
    }
    println("")
}