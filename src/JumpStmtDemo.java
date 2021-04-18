public class JumpStmtDemo {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
//                if(i == 5){
//                    continue outerLoop; //break;
//                }
                System.out.print(i + "" + j+ " ");
            }
            System.out.println();
        }
    }
}
