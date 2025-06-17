import java.util.*;

public class RearrangePosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements (positive and negative integers):");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }


        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < positives.size() && j < negatives.size()) {
            result.add(positives.get(i++));
            result.add(negatives.get(j++));
        }

        while (i < positives.size()) {
            result.add(positives.get(i++));
        }

        while (j < negatives.size()) {
            result.add(negatives.get(j++));
        }

        System.out.print("Rearranged: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
