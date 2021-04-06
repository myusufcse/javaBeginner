class Person{
    int age = 45;
    static final int year = 1990;
    Person() {
        System.out.println("Parent Class Cons "+age);
    }
    void message(){System.out.println("welcome from Super");}
}

public class SuperThisDemo extends Person{
    static final int year = 1980;
    public void message(){
        //super.message();
        System.out.println("welcome to java from child");
    }
    int age = 25;
    SuperThisDemo() {
        super();
        System.out.println("Demo2 Class Cons "+this.age);
        System.out.println("Calling parent class age from Demo2 Class "+super.age);
    }

    void display(){
        this.message();//will invoke current class message() method
        super.message();//will invoke parent class message() method
    }

    public static void main(String args[]){
        SuperThisDemo s=new SuperThisDemo();
        s.display();

        System.out.println(Person.year);
    }
}

