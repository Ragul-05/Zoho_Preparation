public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("The missing number is: " + missingNum(arr));
    }
    static int missingNum(int arr[]) {
        int n = arr.length+1;
        long expected_sum =(long) n * (n + 1) / 2;
        
        long sum = 0;
        for(int i = 0 ; i <arr.length;i++){
            sum += arr[i];
        }
        
        return (int)(expected_sum-sum);
        
    }
}
