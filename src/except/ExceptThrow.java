package except;



public class ExceptThrow {
    public static void main(String[] args) {
        try {
            System.out.println(getNameCapitalized("what"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String getNameCapitalized(String name) throws Exception { // Alerting caller by mentioning throws keyword
        if(name.equals("hello"))
            throw new Exception(); // manually throwing exception for all "hello" user

        return name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
    }
}
