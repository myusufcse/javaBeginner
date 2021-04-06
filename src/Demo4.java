public class Demo4 {

    public static void main(String[] args) {
//        int a = 2;
//        int b = 5;
//
//        System.out.println(a);
//        System.out.println(b);
//        // Unari Opr
//        //prefix
//        System.out.println(++a); //3
//        System.out.println(--b); //4
//        //postfix
//        System.out.println(a++); // 3
//        System.out.println(b--); // 4
//
//        System.out.println(a);
//        System.out.println(b);

        int c = 7; // 7
              // 7 + 9 + 9 - 7
        int d = c++ + ++c + c-- - --c;

        System.out.println(c); // c = 7
        System.out.println(d); // d = 18
                // 18 + 8 - 18 * 8
        int e = d++ + ++c - --d * c;

        System.out.println("c = " +c); // 8
        System.out.println("d = " +d); // 18
        System.out.println("e = " +e); //

        // Binary +, -, / *
        System.out.println("c + d = " + (c + d));

        // ternary ?:
        boolean isAllowed = false;
        int age = 10;

        String yourMsg1 = isAllowed ? "you are allowed" : "sorry! you are not allowed";
        System.out.println(yourMsg1);
        String yourMsg2 = (age > 18) ? "you are allowed" : "sorry! you are not allowed";
        System.out.println(yourMsg2);

//        System.out.println((age > 18) ? "you are allowed" : "sorry! you are not allowed");

//        if (age > 18)
//            System.out.println("you are allowed");
//        else
//            System.out.println("sorry! you are not allowed");

        // Compound Assignment operator x = x + 6 || x += 6, -=, *=, /=
        age++; // 11
        age += 5; // 16
        System.out.println(age);

        int f = 10;
        int g = 20;
        System.out.println("f == g = " + (f == g) ); //false
        System.out.println("f != g = " + (f != g) ); //true
        System.out.println("f > g = " + (f > g) ); //false
        System.out.println("f < g = " + (f < g) ); //true
        System.out.println("g >= f = " + (g >= f) ); //true
        System.out.println("g <= f = " + (g <= f) ); //false

        // instanceof
        System.out.println(yourMsg2 instanceof String);

        // && ||
        String role = "Dr";
        System.out.println((age > 50) && (role == "military")? " 20% intrest for you" : "10% intrest for you");


    }
}
