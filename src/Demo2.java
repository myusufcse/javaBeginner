public class Demo2 {
    // Constant must contains final keywords.
    static final float PI = 3.14f; //must be done in sameline
    static final String NAME = "Ferry";

    public static void main(String args[]) {
        final int NO_OF_WHEELS; //can be done in same line or different line
        NO_OF_WHEELS = 4;
        System.out.println(NAME);

        System.out.println(PI +    " <=======> " + NO_OF_WHEELS);

        // PI=4.14f; Cannot work throw an Error.
        //NO_OF_WHEELS =2;
    }
}
