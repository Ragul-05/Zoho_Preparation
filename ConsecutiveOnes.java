public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of consecutive 1's: " + result);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int count= 0,maxCount=0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
    
}
