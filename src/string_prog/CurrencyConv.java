package string_prog;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConv {
    public static void main(String[] args) {
        System.out.println(string_prog.Demo.s);
        Scanner scanner = new Scanner(System.in);
        double payment = 12324.134d; //scanner.nextDouble();
        scanner.close();


        String us = NumberFormat.getCurrencyInstance(Locale.US)
                .format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"))
                .format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA)
                .format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE)
                .format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
