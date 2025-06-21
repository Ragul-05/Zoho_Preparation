public class RunLengthEncoding {
    public static void main(String[] args) {
        String s1 = "AAAbbAAccAAA";
        String s2 = "AAAAABBBC";

        System.out.println("Case 1: " + compress(s1)); 
        System.out.println("Case 2: " + compress(s2)); 
    }

    static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }
                sb.append(s.charAt(i - 1));
                count = 1;
            }
        }
        //Edge case for the last element of the string 
        if (count > 1) {
            sb.append(count);
        }
        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }
}
