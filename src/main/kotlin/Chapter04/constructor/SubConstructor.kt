package Chapter04.constructor

open class View {
    private val context: String;
    private val attribute: String;

    constructor(context: String) : this(context, "none")

    constructor(context: String, attribute: String) {
        this.context = context;
        this.attribute = attribute;
    }
}

class MyButton : View {
    //클래스에 주 생성자가 없다면 모든 부 생성자는 상위 클래스를 초기화하거나 다른 생성자에게 생성을 위임
    constructor(context: String) : super(context, "none")

    constructor(context: String, attribute: String) : super(context, attribute)
}