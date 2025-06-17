import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        // Desired output:
        // 1 2 3 4 5
        // 1 2 3 4 4
        // 1 2 3 3 3
        // 1 2 2 2 2
        // 1 1 1 1 1

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((n - i + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
