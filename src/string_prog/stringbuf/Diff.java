package string_prog.stringbuf;

public class Diff {
    // String vs StringBuffer vs StringBuilder
    public static void main(String[] args) {
        String str = "fghjk"; // new String("fghjk");
        System.out.println(str);
        str = "Apple"; // new String("Apple");
        System.out.println(str);
        str = "Green " + str; // new String("Green Apple");
        System.out.println(str);

        StringBuffer sbf = new StringBuffer("");
        System.out.println(sbf);
        sbf.append("Green");
        sbf.append(" Apple");
        sbf.reverse();
        System.out.println(sbf);

    }
}
