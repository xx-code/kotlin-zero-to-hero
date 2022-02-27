fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    println(" ")
    println("with index")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    println(" ")
    println("with while loop")
    var index = 0
    while (index < items.size) {
        println("Item at $index with whileloop is ${items[index]}")
        index++
    }
    println(" ")
    println("with when expression")
    fun describe(obj: Any): String =
        when(obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is Long -> "Not String"
            else -> "Unknown"
        }
    println(describe(5))
}