package Chapter02.expression

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval(expression: Expression): Int =
    when (expression) {
        is Num -> expression.value
        is Sum -> eval(expression.right) + eval(expression.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }