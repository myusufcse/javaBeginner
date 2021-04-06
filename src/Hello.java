import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hello extends string_prog.Demo{

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int l = a.length;
        int[] rev_a = new int[l];
        int j = 0;
        for(int i = l-1; i>=0;i--,j++) {
            rev_a[j] = a[i];
        }
        return rev_a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] res = reverseArray(new int[]{1,4,3,2});

        for (int a: res) {
            System.out.format("%d ",a);
        }

        scanner.close();
    }
}
