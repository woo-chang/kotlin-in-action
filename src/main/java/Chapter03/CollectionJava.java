package Chapter03;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionJava {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(List.of(1, 7, 53));
        List<Integer> list = new ArrayList<>(List.of(1, 7, 53));
        Map<Integer, String> map = new HashMap<>(
                Map.ofEntries(
                        new SimpleEntry<>(1, "one"),
                        new SimpleEntry<>(7, "seven"),
                        new SimpleEntry<>(53, "fifty-three")
                )
        );

        System.out.println(set.getClass());
        System.out.println(list.getClass());
        System.out.println(map.getClass());
    }

}
