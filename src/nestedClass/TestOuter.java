package nestedClass;

/**
 * Non-static nested class (inner class)
 *      Member inner class
 *      Anonymous inner class
 *      Local inner class
 * Static nested class
 */
public class TestOuter {
    static int data=30;
    int num = 5;
    static class Inner{
        void msg(){System.out.println("data from outer class is "+data);}
        void msg3(){System.out.println("instant data from outer class is "+new TestOuter().num);}
        static void msg1(){System.out.println("static data from outer class is "+data);}
    }
    public static void main(String args[]){
        TestOuter.Inner obj=new TestOuter.Inner();
        obj.msg();
        obj.msg3();
        TestOuter.Inner.msg1();
    }
}
