package Chapter02.iteration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionIteration {

    public static void main(String[] args) {
        List<String> list = List.of("10", "11", "1001");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("%d: %s", i, list.get(i)));
        }

        System.out.println(isLetter('q'));

        System.out.println(isNotDigit('x'));

        System.out.println(recognize('8'));

        System.out.println("Kotlin".compareTo("Java") >= 0 && "Kotlin".compareTo("Kotlin") <= 0);

        System.out.println(new HashSet<>(List.of("Java", "Scala")).contains("Kotlin"));
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static boolean isNotDigit(char c) {
        return c < '0' || c > '9';
    }

    private static String recognize(char c) {
        if (c >= '0' && c <= '9') {
            return "It's a digit!";
        }
        if (isLetter(c)) {
            return "It's a letter!";
        }
        return "I don't know...";
    }
}
