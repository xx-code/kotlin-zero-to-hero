// si on peut avoir un null en kotlin il faut bien le specifié avec un "?"
fun parseInt(str: String?): Int? {
    if (str == null) return null
    return str.toInt()
}

fun main() {
    println("it is in string 3 now ${parseInt("3")} it's in interger")
    println("it is in string empty now ${parseInt(null)} it's null")
}