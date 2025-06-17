import java.util.Arrays;
import java.util.Scanner;
public class ModifiedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }

        int sum = arr[0] + arr[arr.length - 1];
        arr[0] = sum;
        arr[arr.length - 1] = sum;

        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}