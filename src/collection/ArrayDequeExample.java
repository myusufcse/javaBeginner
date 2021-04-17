package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * To Maintain the Insertion Order and it will ack as a QUE
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> arrDQ = new ArrayDeque<>();
        arrDQ.addFirst("hi");
        arrDQ.addFirst("helo");
        arrDQ.add("hello");
        arrDQ.addLast("are");
        System.out.println(arrDQ);
        System.out.println(arrDQ.peek());
        System.out.println(arrDQ.peekFirst());
        System.out.println(arrDQ.peekLast());
        System.out.println("Removed : "+arrDQ.pollFirst());
        System.out.println(arrDQ);
        System.out.println("Removed : "+arrDQ.pollLast());
        System.out.println(arrDQ);

        arrDQ.forEach(System.out::println);

        arrDQ.addLast("how");
        arrDQ.addLast("are");
        arrDQ.addLast("you");
        arrDQ.addLast("Yusuf");
        arrDQ.forEach(e -> System.out.printf("%s ",e));

        arrDQ.removeIf(s -> s.length() > 3);
        System.out.println("");

        arrDQ.forEach(e->System.out.printf("%s ",e));

        Iterator<String> iter = arrDQ.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove();
        }

    }
}
