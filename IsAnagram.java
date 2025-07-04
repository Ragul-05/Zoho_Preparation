public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = isAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + result); 
    }

    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] charCount = new int[26];
        for(int i = 0; i < str1.length(); i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for(int c : charCount){
            if(c != 0 ){
                return false;
            }
        }
        return true;
    }
}

