import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
         //Sum of Numbers
        //Input: [1,2,3,4,5]
        //Output: 6
        //Explanation: 1 + 2 + 3 + 4 + 5 = 15 => 1 + 5 => 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.print("The array elements: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        System.out.println("The sum is ,"+sum);

        int res = sum;
        int add = 0;
        while(res > 0){
            add += res % 10;
            res = res/10;
        }

        System.out.println("The final output of sum :"+add );
    }
}
