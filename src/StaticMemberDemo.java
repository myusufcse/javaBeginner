public class StaticMemberDemo {
    // Static Member

    // Static Variable
    static int a;
    static int data = 25;

    public static void main(String[] args) {
        // called the static variable
        a = 67;
        System.out.println(a);
        System.out.println(data);
        int a;
        a = 4;
        StaticMemberDemo.a = 44;
        System.out.println("local variable ??? " + a);
        System.out.println("static variable ??? " +StaticMemberDemo.a);


        // call the static method
        System.out.println(StaticMemberDemo.getNames());
    }

    public int plusData(){
        System.out.println(StaticMemberDemo.getNames());
        return ++StaticMemberDemo.data;
    }

    static String getNames() {
        return "I am a static method";
    }
}
