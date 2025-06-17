import java.util.*; 
public class Pattern7 {
    public static void main(String[] args) {
        //output of this program like the below:
        //1
        //2   6
        //3   7  10
        //4   8  11  13
        //5   9  12  14  15
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = i + 1; 
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", num);
                num += (n - j - 1); 
            }
            System.out.println();
        }

        sc.close();
    }
}
