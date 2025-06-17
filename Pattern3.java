import java.util.*;
public class Pattern3 {
    /*output:
      5 4 3 2 1
        4 3 2 1
          3 2 1
            2 1
              1
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=n-i+1;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
