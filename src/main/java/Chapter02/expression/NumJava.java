package Chapter02.expression;

public class NumJava implements ExpressionJava {

    private final int value;

    public NumJava(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
