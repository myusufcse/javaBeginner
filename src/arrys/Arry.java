package arrys;

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

        //System.out.println(sarr);


    }
}
