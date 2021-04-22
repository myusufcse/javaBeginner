package nestedClass;

public class LocalInner1 {
    private int data = 30;//instance variable
    static float pi = 3.14f;//static variable

    void display() {
        class Local {
            int value = 10; //local variable must be final till jdk 1.7 only
            void msg() {
                System.out.println(++data);
                System.out.println(++value);
                System.out.println(LocalInner1.pi);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        LocalInner1 inner1 = new LocalInner1();
        inner1.display();
        //++inner1.data;
        inner1.display();

    }
}
