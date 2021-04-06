public class Demo5 {
    //modifier modif returnType methodName(list of arg) {}
    static int pt = 5; //100

    public static void main(String[] args) {

      // ClassName objectName = new ClassName();
        Demo5 demo5 = new Demo5();
        int year = demo5.getCurrentYear();
        byte b = 2;
        System.out.println(demo5.add(b));

         System.out.println(demo5.getCurrentYear());
         System.out.println(demo5.add("10", 5));
         System.out.println(demo5.add(10, 5, 8));
         // System.out.println(demo5.add(demo5.add(10, 5),8));
         System.out.println(demo5.nameSquare("Hello! "));

         System.out.println("Before changing pt value : " + Demo5.pt); // 5
         changePt(); //
         System.out.println("After changing pt value : " + Demo5.pt); // 100
    }

    private static void changePt() {
        pt *= 20;
        return;
    }

    private int getCurrentYear() {
        return 0;
    }


    private int add(int a, int b){
        return a+b;
    }

    int add(short s) {
        return s*2;
    }

    // By changing the data type
    private int add(String a, int b){
        return (Integer.parseInt(a) +b);
    }

    // By increasing number of arg
    private int add(int a, int b, int c){
        return a+b+c;
    }

    String nameSquare(String name) {
        return name+name;
    }

}