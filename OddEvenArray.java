import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddEvenArray {
    public static void sortSpecificOrder(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0)
                evens.add(num);
            else
                odds.add(num);
        }

        Collections.sort(odds, Collections.reverseOrder());
        Collections.sort(evens);
        int i = 0;
        for (int odd : odds) arr[i++] = odd;
        for (int even : evens) arr[i++] = even;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        sortSpecificOrder(arr);
        System.out.println(Arrays.toString(arr));  
    }
}

