package Chapter02.iteration;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapIteration {

    public static void main(String[] args) {
        TreeMap<Character, String> map = new TreeMap<>();

        for (int i = 'A'; i <= 'Z'; i++) {
            map.put((char) i, Integer.toBinaryString(i));
        }

        for (Entry<Character, String> entry : map.entrySet()) {
            System.out.println(String.format("%s = %s", entry.getKey(), entry.getValue()));
        }
    }

}
