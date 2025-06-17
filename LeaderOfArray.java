import java.util.*;

public class LeaderOfArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leaderofarray(arr);
    }

    public static void leaderofarray(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];

        List<Integer> leaders = new ArrayList<>();
        leaders.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);
        for (int val : leaders) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
