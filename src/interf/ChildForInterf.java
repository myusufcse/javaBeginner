package interf;

public class ChildForInterf implements Printable, Formater{
    @Override
    public void printFiveTimes() {
        int i = 0;
        do {
            System.out.println("printFiveTimes : "+ ++i);
        }while (i<5);
    }

    public static void main(String[] args) {
        final int i;
        ChildForInterf cfi = new ChildForInterf();
        cfi.printFiveTimes();
        System.out.println(Printable.PI);
        i = 5;
        System.out.println(i);
        // i = 6; already initialized the value.
        System.out.println(i);
    }
}
