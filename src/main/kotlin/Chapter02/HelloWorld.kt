package Chapter02

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1, 2))
    println(max(1, 2))

    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문";
    val answer: Int = 42;
    val yearsToCompute = 7.5e6;
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b