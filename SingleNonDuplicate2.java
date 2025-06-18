import java.util.HashMap;
import java.util.Map;

public class SingleNonDuplicate2 {
    public static void main(String[] args) {
        int num[] = {1,2,3,3,3,2,2};
        System.out.println(singleNumber(num));
    }
    static public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int s : nums){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
