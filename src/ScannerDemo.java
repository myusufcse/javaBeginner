import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter number of times : ");

        // Getting input from user
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for (int j = 0; j < count; j++) {
            System.out.println("Hello world! " + (j + 1));
        }

        // getting string
        //String name = scanner.next();
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("your input msg : " + name);

        System.out.println(string_prog.Demo.s);

        java.util.Date date = new java.util.Date();
        System.out.println("Today Date : " + date);

    }
}
