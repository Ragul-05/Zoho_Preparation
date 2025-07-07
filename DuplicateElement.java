import java.util.HashMap;

public class DuplicateElement {
    public static void main(String[] args) {
       int[] arr = {1,2,2,1,3,4,5};
       findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr) {
        HashMap<Integer,Integer> dup = new HashMap<>();
        for(int nums : arr){
            dup.put(nums, dup.getOrDefault(nums, 0) + 1);
        }

        for(int key:dup.keySet()){
            if(dup.get(key) > 1){
                System.out.println("Duplicate Element: " + key + " Count: " + dup.get(key));
            }
        }
    }
}
