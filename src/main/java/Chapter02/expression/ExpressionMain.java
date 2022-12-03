package Chapter02.expression;

public class ExpressionMain {

    public static void main(String[] args) {
        System.out.println(
                eval(new SumJava(new SumJava(new NumJava(1), new NumJava(2)), new NumJava(4))));
    }

    public static int eval(ExpressionJava expression) {
        if (expression instanceof NumJava) {
            NumJava num = (NumJava) expression;
            return num.getValue();
        }
        if (expression instanceof SumJava) {
            return eval(((SumJava) expression).getRight()) + eval(((SumJava) expression).getLeft());
        }
        throw new IllegalArgumentException("Unknown Expression");
    }

}
