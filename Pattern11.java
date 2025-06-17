import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int number = 1;
        int rowinc = 0;
        for (int i = 0; i < n; i++) {
            int temp = number;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3s",temp);
            }
            System.out.println();
            if (i%2 == 0) {
                rowinc++;
            }
            number+=rowinc;
        }
    }
}
