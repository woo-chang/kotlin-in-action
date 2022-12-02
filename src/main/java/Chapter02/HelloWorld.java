package Chapter02;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(max(1, 2));

        final String question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문";
        final int answer = 42;
        final double yearsToCompute = 7.5e6;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

}
