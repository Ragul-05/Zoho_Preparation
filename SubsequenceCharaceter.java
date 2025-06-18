import java.util.*;
public class SubsequenceCharaceter {
    public static void main(String[] args) {
        String A1 = "AXY", B1 = "YADXCP";
        if(isSubSequence(A1, B1)){
            System.out.println("1");
        } else {
            System.out.println("0");
        } 

        String A2 = "gksrek", B2 = "geeksforgeeks";
        if(isSubSequence(A2, B2)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    static boolean isSubSequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int i = 0, j = 0;
        while( i < m && j<n){
            if(a.charAt(i) == b.charAt(j)){
                i++;     
            }
            j++;
        }
        return i==m;
    }
        
}
