public class LoopStmtDemo {
    public static void main(String[] args) {
        // while loop
        int i = 0; // initialization
//        while(i<5){ // condition
//            System.out.println("Hello I am while!");
//            i++; // increment or decrement
//        }

        // do while loop
//        do{
//            System.out.println("Hello I am do while!");
//            //i++;
//        }while(i<5);
//        System.out.println("rest of my program");

        // for loop
//        for(int j = 10; j>0;j--) {
//            System.out.println("j value = " + j); //
//        }
//        System.out.println("rest of my program");


        // for each loop
        int array[] = {1,4,6,45,23,78,123};
        System.out.println(array.length);
        for (int value : array) {
            System.out.println(value);
        }



    }
}
