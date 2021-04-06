package string_prog;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagRemover {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        System.out.println("\n\n");
        while(testCases>0){
            String line = in.nextLine();
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            int matches = 0;
            while(m.find()) {
                matches++;
                System.out.println(m.group(2));
            }
            if(matches == 0) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
