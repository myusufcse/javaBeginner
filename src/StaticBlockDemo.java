public class StaticBlockDemo {
    static final int VERSION;
    int x =10;
    static {
        VERSION = 45;
        System.out.println("First");
        System.out.println("World "+ VERSION);
        //System.exit(0);
    }

    {
        System.out.println("When will i run?");
        System.out.println("When Object is created   ---> " + this);
    }

    public static void main(String[] args) {
        StaticBlockDemo smd = new StaticBlockDemo();
        StaticBlockDemo smd2 = new StaticBlockDemo();
        System.out.println("Hello "+ VERSION);

    }
}
