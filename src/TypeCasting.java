import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        System.out.println(d);
        System.out.println("After Casting");
        int id = (int) d;
        System.out.println(id);


        System.out.println("Math Class in java");

        System.out.println(Math.round(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.random());

        Random random = new Random();
        System.out.println(random.nextInt(100));


    }
}
