public class EvenNumberEx1 {
    public static void main(String[] args) {
        int i = 0;
//        print even number
        while (i <= 100) {
            if(i > 10 && i < 20){
                i++;
                continue;
            }
            if(i == 50) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        // print odd number
        for(int j=1;j<=100;j++){
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

    }
}
