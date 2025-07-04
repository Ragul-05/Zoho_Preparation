import java.util.*;

public class CountDistinct {
    public static List<Integer> countDistinctBrute(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }
            result.add(set.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinctBrute(arr, k)); 
    }
}
