public class LongestPalindromeWord {

    public static void main(String[] args) {
        String sentence = "madam racecar apple noon";
        String result = findLongestPalindrome(sentence);
        System.out.println("Longest Palindromic Word: " + result);
    }

    public static String findLongestPalindrome(String str) {
        int maxLen = 0;
        String longest = "";

        int start = 0;
        int n = str.length();

        for (int i = 0; i <= n; i++) {
            if (i == n || str.charAt(i) == ' ') {
                int end = i - 1;
                String word = extractWord(str, start, end);

                if (isPalindrome(word) && word.length() > maxLen) {
                    longest = word;
                    maxLen = word.length();
                }

                start = i + 1;
            }
        }

        return longest;
    }

    public static String extractWord(String str, int start, int end) {
        String word = "";
        for (int i = start; i <= end; i++) {
            word += str.charAt(i);
        }
        return word;
    }
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
