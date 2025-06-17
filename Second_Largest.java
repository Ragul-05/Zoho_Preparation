import java.util.Arrays;

class Second_Largest {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, cnt = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] != nums[i - 1]) 
                cnt++;
            if (cnt == 4)
                return nums[i - 1];
        }

        return nums[n - 1];
    }
    public static void main(String[] args) {
        Second_Largest obj = new Second_Largest();
        int[] nums = {7,2,6,1,2,4,5,9,8,10};
        System.out.println(obj.thirdMax(nums)); 
    }
}