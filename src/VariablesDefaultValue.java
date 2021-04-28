public class VariablesDefaultValue {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;
    static String str;
    static int[] data;

    byte obj_b;
    short obj_s;
    int obj_i;
    long obj_l;
    float obj_f;
    double obj_d;
    char obj_c;
    boolean obj_bool;
    String obj_str;
    int[] obj_data;
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
        System.out.println("Static variables - Global variable take default value if i don't initialize");
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("char : " + c);
        System.out.println("boolean : " + bool);
        System.out.println("String : " + str);
        System.out.println("Int Array : " + data);
        // java.lang.NullPointerException ( We cant find null length)
        // System.out.println("Int Array length: " + data.length);
        VariablesDefaultValue d = new VariablesDefaultValue();
        System.out.println("Non Static Variables - Global variable take default value if i don't initialize");
        System.out.println("byte : " + d.obj_b);
        System.out.println("short : " + d.obj_s);
        System.out.println("int : " + d.obj_i);
        System.out.println("long : " + d.obj_l);
        System.out.println("float : " + d.obj_f);
        System.out.println("double : " + d.obj_d);
        System.out.println("char : " + d.obj_c);
        System.out.println("boolean : " + d.obj_bool);
        System.out.println("String : " + d.obj_str);
        System.out.println("Int Array : " + d.obj_data);
        // java.lang.NullPointerException ( We cant find null length)
        // System.out.println("Int Array length: " + d.obj_data.length);

        int i = Integer.parseInt("101");
        float f = Float.parseFloat("101");
        long l = Long.parseLong("101");
        System.out.println("Integer : " + i);
        System.out.println("Float : " + f);
        System.out.println("Long : " + l);


    }
}

