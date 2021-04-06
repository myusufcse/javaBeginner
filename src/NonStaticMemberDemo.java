public class NonStaticMemberDemo {

    String car;
    int wheels = 4;
    long carModel = 2019l;
    float mil = 24.6f;
    static String carColor = "Black";


    void printLine() {
        System.out.println("==================");
    }

    public void printCarDetails() {
        System.out.println(car);
        System.out.println(wheels);
        System.out.println(carModel);
        System.out.println(mil);
        System.out.println(carColor);
    }

    public static void main(String[] args) {
        NonStaticMemberDemo nsmd = new NonStaticMemberDemo();
        nsmd.printLine();
        nsmd.printCarDetails();
        nsmd.printLine();
        System.out.println("After Changing Value");
        nsmd.car = "Tesla";
        nsmd.carModel = 2020;
        nsmd.mil = 30;
        NonStaticMemberDemo.carColor = "Red";
        nsmd.printLine();
        nsmd.printCarDetails();
        nsmd.printLine();
        NonStaticMemberDemo nonStaticMemberDemo = new NonStaticMemberDemo();
        nonStaticMemberDemo.printCarDetails();
    }
}
