package Chapter03

fun main() {
    val collection = arrayListOf(1, 2, 3)
    println(joinToString(collection, separator = " ", prefix = "(", postfix = ")"))
    println(joinToString(collection, separator = " "))
    println(joinToString(collection))
    println(joinToString(collection, prefix = "(", postfix = ")"))
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}