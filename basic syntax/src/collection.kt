fun main() {
    val items = listOf("vulem", "juicy", "banana")
    when {
        "orange" in items -> println("No orangeee")
        "banana" in items -> println("yes yes")
    }
    println("fonction utilie")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}