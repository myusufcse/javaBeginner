package string_prog;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double dec = scanner.nextDouble();
        String name = scanner.next();

        System.out.println(age +" " + dec +" " + name);

        System.out.printf("%-14s %.1f  %03d",name,dec,age);

     }
}
