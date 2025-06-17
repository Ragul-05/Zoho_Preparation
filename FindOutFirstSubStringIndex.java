import java.util.Scanner;

public class FindOutFirstSubStringIndex {
       public static void main(String[] args) {
        // The First string : i am from canada
       // Find out index string :adanac
       // The indexed position of the reversed string is ,11
       Scanner sc = new Scanner(System.in);
        System.out.print("The First string :");
        String str = sc.nextLine();
        System.out.print("Find out index string :");
        String str1 = sc.nextLine();
        String str2 = "";
        int n = str1.length()-1;
        for(int i = n;i>0;i--){
            str2 += str1.charAt(i);
        }
        if(str.contains(str2)){
            System.out.print("The indexed position of the reversed string is ,"+ str.indexOf(str2));
        }
        else{
            System.out.print("-1");
        }
       }
}
