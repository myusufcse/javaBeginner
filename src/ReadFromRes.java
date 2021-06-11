import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ReadFromRes {
    public static void main(String[] args) {
        Locale localeFr = Locale.FRENCH;
        Locale localeDutch = new Locale("nl", "NL");
        Locale localeDf = Locale.getDefault();

        ResourceBundle resBundle = ResourceBundle.getBundle("res.multiLan", localeDutch);
        System.out.println(resBundle.getString("hello"));
        System.out.println(resBundle.getString("onlyEnglish"));
        // System.out.println(resBundle.getString("dafadsf"));

        String frmtMsg = MessageFormat.format(resBundle.getString("label1"), "one");
        System.out.println(frmtMsg);
        System.out.println(MessageFormat.format(resBundle.getString("label2"), "two","!!"));
    }
}
