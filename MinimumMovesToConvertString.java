public class MinimumMovesToConvertString {
    public static void main(String[] args) {
        String s = "XXOX";
        System.out.println(minimumMoves(s));
    }
    static public int minimumMoves(String s) {
        int i=0;
        int step=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i=i+3;
                step++;
            }
            else{
                i++;
            }
        }
        return step;
    }
}
