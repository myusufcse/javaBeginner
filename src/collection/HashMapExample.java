package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();
        hmap.put("O","One");
        hmap.put("T","Two");
        hmap.put("Th","Three");
        hmap.put("F","Five");
        System.out.println(hmap);
        hmap.remove("Th");
        System.out.println(hmap);
        //System.out.println(hmap.get("O"));
        System.out.println("Keys\tValues");
        for (String key: hmap.keySet()) {
            System.out.println(key +" \t "+ hmap.get(key));
        }
    }
}
