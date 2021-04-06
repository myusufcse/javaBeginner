import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arrayList = new ArrayList<Integer>();
        int total = 0;
        //10
        //64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
        for(int i = 0; i<n ;i++){
            int temp = in.nextInt();
            arrayList.add(temp);
            total += temp;
        }
        Collections.sort(arrayList);
        double mean = (double)total / n;
        System.out.println(mean);

        double median;
        if(n%2==0) {
            median = (double)((arrayList.get(n/2) +  arrayList.get((n/2)-1))) / 2;
        } else {
            median = arrayList.get((n/2));
        }
        System.out.println(median);

        int freq = 0;
        int modePosition = 0;
        int mode = 0;
        for(int i = 0; i<n ;i++){
            int temp = arrayList.get(i);
            int count = 0;
            for(int j = 0; j<n ;j++){
                if(temp == arrayList.get(j)){
                    count +=1;
                }
            }
            if(count>freq){
                freq = count;
                modePosition = i;
                mode = temp;
            } else if(count==freq && mode>temp) {
                modePosition = i;
                mode = temp;
            }
        }
        System.out.println(mode);

        in.close();
    }
}
