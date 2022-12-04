package Chapter02.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ExceptionJava {

    public static void main(String[] args) {
        int number = 10;
        int percentage;

        if (number >= 0 && number <= 100) {
            percentage = number;
        } else {
            throw new IllegalArgumentException(
                    String.format("A percentage value must be between 0 and 100: %d", number));
        }

        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException(
                    String.format("A percentage value must be between 0 and 100: %d", percentage));
        }

        BufferedReader reader1 = new BufferedReader(new StringReader("239"));
        System.out.println(readNumber(reader1));

        BufferedReader reade2 = new BufferedReader(new StringReader("not a number"));
        System.out.println(readNumber(reade2));
    }

    private static Integer readNumber(BufferedReader reader) {
        try (reader) {
            String line = reader.readLine();
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
