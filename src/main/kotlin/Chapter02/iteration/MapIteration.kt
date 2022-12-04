package Chapter02.iteration

import java.util.*

fun main() {
    val map = TreeMap<Char, String>()

    for (i in 'A'..'Z') {
        map[i] = Integer.toBinaryString(i.code);
    }

    for((key, value) in map) {
        println("$key = $value")
    }
}