package Chapter03

fun save(user: User) {
    user.validateBeforeSave()
    //user를 DB에 저장
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "name")
    validate(address, "address")
}

class User (
    val id: Int,
    val name: String,
    val address: String
)