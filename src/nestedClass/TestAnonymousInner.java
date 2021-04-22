package nestedClass;

abstract class Person{
    static String msg = "I am from Person class";
    int data = 10;
    abstract void eat();
}
public class TestAnonymousInner{
    public static void main(String args[]){
        Person p=new Person(){
            void eat(){System.out.println("nice fruits");}
        };
        p.eat();
        System.out.println("Person data : "+ p.data);
        p.data =20;
        System.out.println("Person data : "+ p.data);
        System.out.println("Person static msg : "+ Person.msg);
    }
}
