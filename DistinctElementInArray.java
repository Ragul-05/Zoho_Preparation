import java.util.Set;
import java.util.TreeSet;

public class DistinctElementInArray {
    public static void main(String[] args) {
        int[] num ={121,321,45,34};
        distinctelement(num);
    }

    static void distinctelement(int[] dis){
        Set<Integer> distinct = new TreeSet<>();
        for(int num : dis){
            while(num > 0){
                int digit = num % 10;
                distinct.add(digit);
                num/=10;
            }
        }
        for(int d : distinct){
            System.out.print(d + " ");
        }
    }
    
}
