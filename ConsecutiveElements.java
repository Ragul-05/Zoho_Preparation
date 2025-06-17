import java.util.*;

public class ConsecutiveElements {
    public static void main(String[] args) {
        int[] freq = {0, 2, 2, 2, 0, 6, 6, 0, 2};
        int n = freq.length;
        int lastnonzero = 0;
        
        for (int i = 1; i < n; i++) {
            if (freq[i - 1] != 0 && freq[i - 1] == freq[i]) {
                freq[i - 1] += freq[i];
                freq[i] = 0;
            }
        }
        for(int i = 0;i<n;i++){
            if(freq[i] != 0){
                freq[lastnonzero++] = freq[i];
            }
        }

        for(int i = lastnonzero;i<n;i++){
            freq[i] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.print(freq[i] + " ");
        }
        
    }
}
