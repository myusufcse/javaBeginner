package collection;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // To Create a list
        ArrayList<String> list = new ArrayList<>(); // 16
        ArrayList<Integer> list1 = new ArrayList<>(4);
        Integer a = 1;
        List<String> testList = new ArrayList<>();
        testList.add(0, "certification");
        testList.set(0, "guide");
        System.out.println(testList);

        list1.add(a);
        list1.add(a *= 5);
        list1.removeIf(a1 ->a1==1); // Lambda expression's parameter a cannot redeclare another local variable defined in an enclosing scope.
        System.out.println(list1);

        //To Add Value use .add
        list.add("hello");
        list.add("how");
        list.add("how");
        list.add("are");
        list.add("you");
        list.add("???");
        System.out.println(list);

        list.add(0,"Hi");
        System.out.println(list);

        // To remove
        list.remove("hello");
        System.out.println(list);
        list.add("I am fine. Thanks for asking,.");
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        list.set(0,"hello");
        System.out.println(list);

        for (String value: list) {
            System.out.print(value.toUpperCase() + " -> ");
        }

        List<String> list2 = Collections.singletonList(Arrays.toString("I am fine. Thanks for asking,.".split(" ")));
        System.out.println("\n"+list2);

        for (String value: list2) {
            System.out.print(value.toUpperCase() + " -> ");
        }

        Collections.sort(list);
        System.out.println("\n Max value in the list : "+ Collections.max(list));
        System.out.println("\n Max Length value in the list : "+ Collections.max(list, new LengthComparator()));
        list.forEach(System.out::println);

    }

    private static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
