import java.util.Scanner;

public class RightRotationMatch {

    public static int countUnchangedAfterRotation(int[] arr, int x) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int rotatedIndex = (i + x) % n;
            if (arr[i] == arr[rotatedIndex]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements (N): ");
        int n = scanner.nextInt();

        // Read rotation value X
        System.out.print("Enter rotation value (X): ");
        int x = scanner.nextInt();

        // Read the array
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = countUnchangedAfterRotation(arr, x);
        System.out.println("Number of matching elements after rotation: " + result);

        scanner.close();
    }
}