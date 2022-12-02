package Chapter02.rectangle

class Rectangle(
    val height: Int,
    val weight: Int
) {
    val isSquare: Boolean
        get() = height == weight
}