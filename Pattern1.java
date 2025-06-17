import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        //1   2   3   4   5
        //10  9   8   7   6
        //11  12  13  14  15
        //20  19  18  17  16
        //21  22  23  24  25
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            int start = num;
            int end = num + n - 1;
            if (i % 2 == 0) {
                for (int j = start; j <= end; j++) {
                    System.out.printf("%-4d", j);
                }
            } else {
                for (int j = end; j >= start; j--) {
                    System.out.printf("%-4d", j);
                }
            }
            num = end + 1;
            System.out.println();
        }
    }
}
