import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        // 1  3  6 10 15
        // 2  5  9 14 19
        // 4  8 13 18 22
        // 7 12 17 21 24
        // 11 16 20 23 25

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        for (int i = 0; i < n; i++) {
            int temp = number;
            int dec = n;
            for (int j = 0; j < n; j++) {
                if (i+j < n-1) {
                    System.out.printf("%4s",temp);
                    temp = temp + (i+j+2);
                }
                else{
                    System.out.printf("%4s",temp);
                    temp = temp + dec;
                    dec--;
                }
            }
            System.out.println();
            number = number + (i + 1);

        }
    }
}
