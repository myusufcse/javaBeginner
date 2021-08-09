package except;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    public static void main(String[] args) throws CustomException {
        Logger logger = Logger.getLogger(except.TestLogger.class.getName());
        int []iarr = new int[5];
        final String NAME = "Hello";
        logger.setLevel(Level.INFO);
//        Level.SEVERE
//        Level.WARNING
//        Level.CONFIG
//        Level.INFO
//        Level.FINE
//        Level.FINER
//        Level.FINEST

        logger.log(Level.INFO,"This is Info Log");
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
            // int temp = 25 / 0;
        }catch (ArithmeticException e) {
            System.out.println(e+" --> ArithmeticException");
            logger.log(Level.SEVERE,"ArithmeticException", e);
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
        try {
            throw new CustomException("For Fun");
        }finally {
            System.out.println("After throwing CustomException also i will print - finally");
        }
    }
}
