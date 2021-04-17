package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * No Duplicate value here
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> setVal = new HashSet<>(); // initialCapacity 16
        setVal.add("hi");
        setVal.add("hello");
        setVal.add("how");
        setVal.add("are");
        System.out.println(setVal);
        setVal.remove("hij");
        System.out.println(setVal);
        setVal.add("hi");
        System.out.println("add hi again : "+setVal.add("hi"));
        System.out.println("isEmpty ? : "+setVal.isEmpty());
        System.out.println("to check contains hi ? : "+setVal.contains("hi"));

        for (String value: setVal) {
            System.out.print(value.toUpperCase() + " -> ");
        }

        System.out.println("\nLambda Expression");
        setVal.forEach(System.out::println);
        setVal.forEach(e -> {
            System.out.print(e.toUpperCase() + " -> ");
        });

    }
}
