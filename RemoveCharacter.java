import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "oe";
        String result = removeChars(str1, str2);
        System.out.println("Resulting string: " + result); // Output: "hll wrld"
    }
    static String removeChars(String str1, String str2) {
         Set<Character> set = new HashSet<>();
    for (char c : str2.toCharArray()) {
        set.add(c);
    }

    StringBuilder result = new StringBuilder();
    for (char c : str1.toCharArray()) {
        if (!set.contains(c)) {
            result.append(c);
        }
    }
    return result.toString();
}
}