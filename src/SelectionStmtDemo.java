public class SelectionStmtDemo {
    public static void main(String[] args) {
        // if stmt
        int age = 10;
//        if (age > 18) {
//            System.out.println("you are allowed");
//            System.out.println("if stmt");
//        }
//        // if else stmt
//        if (age >= 5) {
//            System.out.println("you are allowed");
//            System.out.println("if stmt");
//        } else {
//            System.out.println("you are not allowed");
//            System.out.println("else stmt");
//        }
        // Multiple if else stmt
        if (age < 3) {
            System.out.println(" No Flight Ticket");
            System.out.println("if stmt");
        } else if(age > 3 && age < 11){
            System.out.println("Half Flight Ticket");
            System.out.println("else if stmt");
        } else {
            System.out.println("Full Flight Ticket");
            System.out.println("else stmt");
        }
        System.out.println("rest of my program");

        // Switch Demo
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' : // grade == 'B' || grade == 'C'
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
                System.out.println("Am i execute ?");
                // break; when there is no break it will continue to execute rest of the program
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

    }
}
