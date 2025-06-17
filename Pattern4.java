import java.util.*;
public class Pattern4 {
    /*output
     *     1
           2    3
           4    5    6
           7    8    9   10
           11   12   13   14   15
           without using the extra variables
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1; i < n ; i ++){
            for(int j = n-i-2; j<=i+1;j++){
                //The below line is used to print the number in a formatted way with 3 spaces which gives the spacing correctly
                System.out.printf("%-3d", num);
                num++;
            }
            System.out.println();
        }
    }

}
