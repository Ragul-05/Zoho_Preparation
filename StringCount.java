import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "aaabbccdddd";
        countingCharacter(str);
    }
    static void countingCharacter(String str1){
        int count = 1;
        char starting = str1.charAt(0);
        for(int i = 1; i<str1.length();i++){
            if(starting == str1.charAt(i)){
                count ++;
            }
            else if(starting != str1.charAt(i)){
                System.out.printf("%c %d  ",starting,count);
                starting = str1.charAt(i);
                count = 1;
            }
            
            
        }
         System.out.printf("%c %d  ",starting,count);
    }
}