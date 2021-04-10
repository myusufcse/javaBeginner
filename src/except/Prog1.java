package except;

public class Prog1 {
    public static void main(String[] args) {
        int []iarr = new int[5];
        final String NAME = "Hello";

        try {
            iarr[0] = 5;
            iarr[1] = 6;
            try {
                iarr[5] = 8; // threw Exception here
            }finally {
                System.out.println("im finally");
            }
            iarr[2] = 2;
            iarr[3] = 3;
            iarr[4] = 0;
            //int temp = 25 / 0;
        }catch (ArithmeticException e) {
            System.out.println(e+" --> ArithmeticException");
        }catch (Exception e) {
            System.out.println(e+" --> Exception");
        }finally {
            iarr[2] = 20;
            iarr[3] = 30;
            iarr[4] = 40;
        }

        for (int i:iarr) {
            System.out.print(i +" ");
        }
        System.out.println();

    }
}
