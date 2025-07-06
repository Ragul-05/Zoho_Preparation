public class ReverseTheString {
    public static void main(String[] args) {
        String str = "Java Full Stack Developer";
        System.out.println("Output : " + reverseEachWord(str));
    }

    public static String reverseEachWord(String str){
        char[] chars = str.toCharArray();
        int n = chars.length;
        int start = 0;
        for(int end = 0 ; end <= n ; end++){
            if(end == n || chars[end] == ' '){
                reverse(chars,start,end-1);
                start = end + 1;
            }
        }
        return new String(chars);

    }

    public static void reverse(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
