package nestedClass;

interface Eatable{
    default void defaultMethod() {
        System.out.println("\"Its crazy to have \n  i. default\n ii. private\niii. static\nconcrete (Fully Implemented) methods in Interface.\"");
    }
    void eat();
}
public class TestAnonymousInner1{
    public static void main(String args[]){
        Eatable e=new Eatable(){
            public void eat(){System.out.println("nice fruits");}
        };
        // above line can be written as below
        Eatable e_lambda = () -> System.out.println("Lambda Method says, eat more fruits");
        e_lambda.eat();
        e.eat();
        e.defaultMethod();
    }
}