package Chapter02.expression;

public class SumJava implements ExpressionJava {

    private final ExpressionJava left;
    private final ExpressionJava right;

    public SumJava(ExpressionJava left, ExpressionJava right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionJava getLeft() {
        return left;
    }

    public ExpressionJava getRight() {
        return right;
    }
}
