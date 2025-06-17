import java.util.*;
public class Pattern5 {
    //the output of this program like the below:
    //             1   2   3   4                     
    //         8   7   6   5
    //     9  10  11  12
    //16  15  14  13 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i = 0; i <n; i++){
            int start = num ;
            int end = num+n-1;
            for(int k = 0; k < n-i; k++){
                System.out.printf("%3s", " ");
            }
            if(i%2==0){
                for(int j = start; j<=end;j++){
                    System.out.printf("%-3d", j);
                }
            }
            else{
                for(int j = end; j>=start;j--){
                    System.out.printf("%-3d", j);
                }
            }
            num = end + 1;
            System.out.println();
        }
       
    }
}
