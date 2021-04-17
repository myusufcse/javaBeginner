package arrys;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Arry {
    public static void main(String[] args) {
        int []iarr = new int[5];
        float[] farr;
        String[] sarr = new String[5];
        farr = new float[5];
        char carr[] = {'a', 'b', 'c', 'd'};

        iarr[0] = 5;
        iarr[1] = 6;
        iarr[2] = 2;
        iarr[3] = 3;
        iarr[4] = 8;
        iarr[0] = 51;
        iarr[1] = 61;
        iarr[2] = 21;
        iarr[3] = 31;
        iarr[4] = 81;
       // iarr[5] = 8; // ArrayIndexOutOfBoundsException
        for (int i:iarr) {
            System.out.print(i +" ");
        }
        System.out.println();
        for (char c:carr) {
            System.out.print(c+" ");
        }
        System.out.println();
        //Arrays Class
        Arrays.sort(iarr);
        Arrays.stream(iarr).forEach(num -> System.out.print(num + " ")); //This will iterate and print each element of the array.

        System.out.println();
        //to sort descending order we need to write code
        reverse(iarr);
        Arrays.stream(iarr).forEach(num -> System.out.print(num + " "));
    }
    public static void reverse(int[] arr)  {
        if(arr == null || arr.length<2) {
            return;
        }
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
