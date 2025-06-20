public class CountWays {
    public static void main(String[] args) {

        String s = "1234";
        int result = countway(s);
        System.out.println("Number of ways to decode: " + result);
    }

    static int countway(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int pre = 1, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            int temp = 0;
            if (s.charAt(i) != '0') {
                temp = cur;
            }
            int two_digit = Integer.parseInt(s.substring(i - 1, i + 1));
            if (two_digit >= 10 && two_digit <= 26) {
                temp += pre;
            }
            pre = cur;
            cur = temp;
        }
        return cur;

    }

}
