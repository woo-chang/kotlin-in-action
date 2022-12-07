package Chapter04.constructor

/**
 * constructor : 주 생성자나 부 생성자 정의를 시작할 때 사용
 */
class User constructor(_username: String) {

    val username: String

    //init : 초기화 블록을 시작
    init {
        username = _username
    }

}

/**
 * username 프로퍼티 초기화 코드를 선언에 포함시킬 수 있다.
 * 별다른 어노테이션이나 가시성 변경자가 없다면 constructor를 생략해도 된다.
 */
class User2(_username: String) {
    val username = _username
}

/**
 * 프로퍼티 정의와 초기화를 간략히 쓸 수 있다.
 * 함수 파라미터와 마찬가지로 생성자 파라미터에도 디폴트 값을 정의할 수 있다.
 */
class User3(
    val username: String,
    val isSubscribed: Boolean = true
)

open class OpenUser(val username: String)

/**
 * 주 생상자에서 기반 클래스 생성자를 호출할 때 괄호 치고 생성자 인자를 넘긴다.
 */
class TwitterUser(username: String) : OpenUser(username)

/**
 * 생성자를 정의하지 않으면 자동으로 디폴트 생성자를 생성한다.
 */
open class Button

/**
 * 디폴트 생성자로 인해 기반 클래스 이름 뒤에는 꼭 빈 괄호가 들어간다.
 * 인터페이스는 생성자가 없기 때문에 인터페이스 이름 뒤에는 괄호가 없다.
 */
class RadioButton : Button()

/**
 * 인스턴스화를 막기 위해서는 주 생성자에 private 변경자를 붙인다.
 */
class Secretive private constructor() {}