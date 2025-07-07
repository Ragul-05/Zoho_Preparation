
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

  
public static char firstNonRepeatingChar(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : str.toCharArray()) {
        if (map.get(c) == 1) return c;
    }
    return '\0';
}
}