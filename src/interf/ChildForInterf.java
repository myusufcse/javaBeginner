package interf;

import java.util.function.Consumer;

public class ChildForInterf implements Printable, Formater{
    @Override
    public void printFiveTimes() {
        int i = 0;
        do {
            System.out.println("printFiveTimes : "+ ++i);
        }while (i<5);
    }

    @Override
    public void printThreeTimes(String... a) {
        int i = 0;
        do {
            System.out.println("printFiveTimes : "+ ++i);
        }while (i<3);
    }

    public void printThreeTimes(String a) {
        int i = 0;
        do {
            System.out.println("printFiveTimes : "+ ++i);
        }while (i<3);
    }

    public static void main(String[] args) {
        Consumer<String> println = System.out::println;
        final int i;
        ChildForInterf cfi = new ChildForInterf();
        cfi.printFiveTimes();
        System.out.println(Printable.PI);
        i = 5;
        System.out.println(i);
        // i = 6; already initialized the value.
        System.out.println(i);
        println.accept("Hello");
    }
}
