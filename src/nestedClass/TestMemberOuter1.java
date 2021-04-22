package nestedClass;

public class TestMemberOuter1 {
    private final int data = 30;

    int squareData() {
        return data * data;
    }
    // Java Member inner class example
    class Inner {
        void msg() {
            System.out.println("data is " + data);
            System.out.println("square data is " + squareData());
        }
    }

    public static void main(String args[]) {
        TestMemberOuter1 outer1 = new TestMemberOuter1();
        TestMemberOuter1.Inner inner = outer1.new Inner();
        inner.msg();
    }
}
