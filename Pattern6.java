import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        //output of this program like the below:
        //1    2    3    4    5
        //6    7    8    9   10
        //11   12   13   14   15
        //16   17   18   19   20
        //21   22   23   24   25
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
               //System.out.printf("%-3d", (i * n + j + 1));// Without the counter variable
                System.out.printf("%-3d", num);// with the counter variable
                num++;
               
            }
            System.out.println();
        }
        sc.close();
    }
}

