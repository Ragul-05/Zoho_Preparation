
public class MaxSubArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + result); // Output: 6
    }
}

class Solution {
    int maxSubarraySum(int[] arr) {
        int current_max = arr[0];
        int max_far = arr[0];

        for(int i = 1 ; i<arr.length;i++){
            current_max = Math.max(arr[i] , current_max + arr[i]);
            max_far = Math.max(max_far,current_max);
        }
        return max_far;
    }
}
