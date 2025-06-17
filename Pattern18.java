public class Pattern18 {
    public static void main(String[] args) {
        // *       *
        // * *   * *
        // *   *   *
        // * *   * *
        // *       *
        pattern18(5);
    }
    static void pattern18(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j == n+1 || i==j || j==1 || j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

