package arrys;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StrArray {
    public static void main(String[] args) {
        String[] strArr = new String[]{"ada","ada","zs","uyaad","hf", "a"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new LengthComparator());
        System.out.println(Arrays.toString(strArr));
    }

    private static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
