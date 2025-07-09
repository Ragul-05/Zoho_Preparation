import java.util.Map;

public class SubArrayEqualWith_k {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        int result = hasSubArrayWithSumK(arr, k);
        System.out.println("Subarray with sum " + k + " exists: " + result);
    }

    /*public static int hasSubArrayWithSumK(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }

        return count;
    }*/

    public static int hasSubArrayWithSumK(int[] nums, int k){
        //HashMap to store the cumulative sum and its frequency
        Map<Integer, Integer> preSum = new java.util.HashMap<>();
        int count = 0;
        int sum = 0;
        preSum.put(0, 1); 
        for(int num : nums){
            sum += num;
            if(preSum.containsKey(sum - k)){
                count += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
