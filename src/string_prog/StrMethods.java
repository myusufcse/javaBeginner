package string_prog;

import java.util.Locale;

public class StrMethods {
    public static void main(String[] args) {
        String name="sachin";
        String lastname="TÈNTEN";

        System.out.println(name.toUpperCase());
        System.out.println(lastname.toLowerCase());
//        System.out.println(lastname.toLowerCase(Locale.US));

        System.out.println(name.length());
        System.out.println(name.substring(2));
        System.out.println(lastname.substring(0,3));

        System.out.println(name.toUpperCase().charAt(0) + name.substring(1)); // Sachin

//        float pi = 3.24f;
//        System.out.println(pi + 2);
//        String spi = String.valueOf(pi);
//        System.out.println(spi + 2);

        System.out.println(name.concat(lastname));
        System.out.println(name.contains("ch"));
        System.out.println(name.startsWith("sa"));
        System.out.println(name.endsWith("in"));
        System.out.println(name.equalsIgnoreCase("sachi"));
        System.out.println("           Oppppppp     11111    ".trim());

        // Split string based on char or str
        String para = "Strings are ordered sequences of character data. Indexing allows you to access individual characters in a string directly by using a numeric value. String indexing is zero-based: the first character in the string has index 0, the next is 1, and so on.";
        System.out.println(para.split(" ").length);

        // Array of String
//        for (String str: para.split(" ")) {
//            System.out.printf("%s-",str);
//        }
        System.out.println(lastname.indexOf('T')); // TÈNTEN
        System.out.println(lastname.indexOf('T',5)); // TÈNTEN
        System.out.println(lastname.replace("TEN","10")); // TÈNTEN


    }
}
