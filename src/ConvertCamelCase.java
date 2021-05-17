import java.lang.StringBuilder;
import java.util.Locale;

class ConvertCamelCase{

    static String toCamelCase(String s){
        StringBuilder out = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i=0;i<s.length();i++) {
            if(arr[i]=='-' || arr[i]=='_') {
                arr[i+1] = (char)(((int)arr[i+1] > 96) ? (arr[i+1] - 32):arr[i+1]);
            }else {
                out.append(arr[i]);
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(ConvertCamelCase.toCamelCase("the-stealth-warrior"));
        System.out.println(ConvertCamelCase.toCamelCase("The_Stealth_Warrior"));
    }
}