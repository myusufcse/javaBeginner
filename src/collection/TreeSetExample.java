package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Maintain the ASCII Table order.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treSet = new TreeSet<>(); // initialCapacity 16
        treSet.add("hi");
        treSet.add("hello");
        treSet.add("how");
        treSet.add("are");
        // treSet.add("are"); No Duplicate allowed : retur
        System.out.println(treSet);
        treSet.remove("hi");
        treSet.add("you");
        treSet.add("5");
        treSet.add("You");
        System.out.println(treSet);

        for (String value: treSet) {
            System.out.print(value.toUpperCase() + " -> ");
        }
    }
}
