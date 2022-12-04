package Chapter02.exception

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    val number = 10

    val percentage =
        if (number in 0..100)
            number
        else
            //Exception이 발생하면 변수가 초기화되지 않는다.
            throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    if (percentage !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
    }

    val reader1 = BufferedReader(StringReader("239"))
    println(readNumber(reader1))

    val reader2 = BufferedReader(StringReader("not a number"))
    println(readNumber(reader2))
}

fun readNumber(reader: BufferedReader): Int? {
    return try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
}