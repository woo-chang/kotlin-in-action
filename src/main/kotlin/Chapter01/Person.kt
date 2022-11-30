package Chapter01

fun main(args: Array<String>) {
    val persons = listOf(
        Person("영희"),
        Person("철수", 29)
    )

    val max = persons.maxBy { it.age ?: 0 }

    println("나이가 가장 많은 사람: $max")
}

data class Person(
    val name: String,
    val age: Int? = null
)