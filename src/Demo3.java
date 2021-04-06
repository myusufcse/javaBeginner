public class Demo3 {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;
    static String str;
    // Global variable take default value if i dont initialize

    public static void main(String args[]) {
//        byte b;
//        short s;
//        int i;
//        long l;
//        float f;
//        double d;
//        char c;
//        boolean bool;
//        String str;
// Local variable must initialized before using it.

        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("char : " + c);
        System.out.println("boolean : " + bool);
        System.out.println("String : " + str);


        int i = Integer.parseInt("101");
        float f = Float.parseFloat("101");
        long l = Long.parseLong("101");
        System.out.println("Integer : " + i);
        System.out.println("Float : " + f);
        System.out.println("Long : " + l);

    }
}

