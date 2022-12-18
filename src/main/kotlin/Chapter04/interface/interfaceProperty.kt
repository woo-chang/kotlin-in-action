package Chapter04.`interface`

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    //닉네임이 호출될 때마다 커스텀 게터가 계산되서 호출되는 방식
    override val nickname: String
        get() = email.substringBefore("@")
}