import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigIntegerDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two BigInteger : ");

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        System.out.println("Enter BigDecimal Array Size : ");

        BigDecimal[] bd = new BigDecimal[scanner.nextInt()];
        for (int i = 0; i < bd.length; i++) {
            bd[i] = scanner.nextBigDecimal();
        }
        Arrays.sort(bd, Collections.reverseOrder());
        System.out.println("Sorted in reverse Order : "+Arrays.toString(bd));
        scanner.close();
        System.out.println("Wrapper Class values");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}
