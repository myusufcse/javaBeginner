package string_prog.stringbuf;

public class StrBuff {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();
        sbf.append("Hello");
        System.out.println(sbf);
        System.out.println(sbf.capacity());
        System.out.println(sbf.delete(3,4));
        System.out.println(sbf.deleteCharAt(1));
        System.out.println(sbf.insert(1,"aa"));
        System.out.println(sbf.reverse());
        System.out.println(sbf.reverse());
        System.out.println(sbf.replace(1,3,"el"));
        System.out.println(sbf.toString());
        Integer i = new Integer(123);
        System.out.println(i+4);
        System.out.println(i.toString()+4);

        String s1 = sbf.toString();
        System.out.println(s1);
        s1 = "Google";

        StringBuilder sbd = new StringBuilder(s1);
        // sbd.append(s1);
        System.out.println(sbd);

        int num = 12345;
        StringBuffer sbf1 = new StringBuffer(num);
        System.out.println(sbf1.reverse());



    }
}
