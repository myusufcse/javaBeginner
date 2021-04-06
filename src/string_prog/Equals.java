package string_prog;

public class Equals {
    public static void main(String[] args) {
        String s1="Sachin"; // String Constant Pool memory
        String s2="Sachin"; // String Constant Pool memory
        String s3=new String("Sachin"); // Non Constant Pool Memory
        String s4="Saurav";
        String s5=new String("Sachin");

        //equals compares the value
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s3.equals(s5));//true

        //== compares the address
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false (because s3 refers to instance created in non-pool)
        System.out.println(s3==s5);//false

        // .compareTo() method to check the value
        System.out.println(s1.compareToIgnoreCase(s4)); // compareToIgnoreCase
        System.out.println("a".compareTo("b"));
        System.out.println("z".compareTo("b"));

        if(s1.compareTo(s4) > 0) {
            System.out.println(s4 + " first then " + s1);
        }else if (s1.compareTo(s4) < 0) {
            System.out.println(s1 + " first then " + s4);
        }

    }

}
