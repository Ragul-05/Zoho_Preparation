import java.util.HashSet;

public class SubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        boolean result = hasSubArrayWithZeroSum(arr);
        System.out.println("Subarray with zero sum exists: " + result);
    }

    public static boolean hasSubArrayWithZeroSum(int[] arr){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            sum += num;
            if(sum == 0 || set.contains(sum)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
