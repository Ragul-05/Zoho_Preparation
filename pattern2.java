import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        //        1
      //        2 1 2
      //      3 2 1 2 3
      //    4 3 2 1 2 3 4
      //  5 4 3 2 1 2 3 4 5
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int space = n -(i+2);
            for(int k =0;k<=space+1;k++){
                System.out.print("  ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        } 
    }
}
