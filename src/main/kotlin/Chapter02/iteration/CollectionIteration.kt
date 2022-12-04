package Chapter02.iteration

fun main() {
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    println(isLetter('q'))

    println(isNotDigit('x'))

    println(recognize('8'))

    println("Kotlin" in "Java".."Kotlin")

    println("Kotlin" in setOf("Java", "Scala"))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..."
    }