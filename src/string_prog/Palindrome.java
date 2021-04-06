package string_prog;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check Palindrome : ");
        String A = sc.next();
        int len = A.length() - 1;
        String B = "";
        for (int y = 0; y < A.length(); y++) {
            B += A.charAt(len--);
        }
        System.out.println("Reversed String : "+B);
        System.out.println("Is Given String Palindrome : " + (A.equals(B) ? "Yes" : "No"));
    }
}
