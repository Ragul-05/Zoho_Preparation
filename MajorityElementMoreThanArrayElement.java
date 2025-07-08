public class MajorityElementMoreThanArrayElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = majorityElementMoore(nums);
        System.out.println("Majority Element: " + result);
    }

    public static int majorityElementMoore(int[] nums) {
    int candidate = nums[0], count = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == candidate) {
            count++;
        } else {
            count--;
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
    }
    count = 0;
    for (int num : nums)
        if (num == candidate) count++;

    return count > nums.length / 2 ? candidate : -1;
}
}
