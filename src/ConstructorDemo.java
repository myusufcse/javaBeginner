public class ConstructorDemo {

    int a;
    String browser = "chrome";

    // constructor
    ConstructorDemo(int a){
        this();
        this.a = a;
        System.out.println("Integer parameterized Constructor Called");
    }

    // constructor
    ConstructorDemo(String browser){
        this(7);
        this.browser = browser;
        System.out.println("String parameterized Constructor Called");
        this.testRunsIn();
    }

    ConstructorDemo() {
        System.out.println("Default Constructor Called");
    }

    void testRunsIn(){
        System.out.println("My Web Testing Runs in "+ browser);
    }

    public static void main(String[] args) {
//       ConstructorDemo cDemo = new ConstructorDemo();
//       cDemo.testRunsIn();

       ConstructorDemo cDemo2 = new ConstructorDemo("Firefox");
      //cDemo2.testRunsIn();
    }
}
