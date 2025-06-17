import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        // Output of this program like the below:
        //                  5
        //              9   4
        //          12  8   3
        //      14  11  7   2
        //  15  13  10  6   1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        for (int i = 0; i < n; i++) {
            int temp = num;
            for (int j = 0; j < n; j++) {
                if (i+j >= n-1) {
                    System.out.printf("%3s",temp);
                    temp = temp - (j + 2);
                }
                else{
                    System.out.printf("%3s"," ");
                }
            }
            num = num + (n - i -1);
            System.out.println();
        }
    }
}
