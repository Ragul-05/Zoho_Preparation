public class VowelsAndConsonants{
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("The vowels and consonants in the string are :"+ countVowelsAndConsonants(str));
    }

    public static String countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }
}