package arrys;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sin.nextInt();
        int []iarr = new int[size];
        System.out.printf("Please provide the %d inputs : ",size);
        for(int i = 0; i<iarr.length;i++) {
            iarr[i]=sin.nextInt();
        }

        System.out.println("Multiple of your array by 2");
//        for (int i: iarr) {
//            System.out.println(i*2);
//        }
        for(int i = 0; i<iarr.length;i++) {
            System.out.println(iarr[i]*2);
        }
        sin.close();
    }
}
