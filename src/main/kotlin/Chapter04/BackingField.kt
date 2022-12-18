package Chapter04

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent()
            )
            //field를 사용하면 뒷받침하는 필드에 접근할 수 있다.
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "Korea"
}