public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
        // * * * * * 
        // * *   * * 
        // *   *   * 
        // * *   * * 
        // * * * * * 
    }

    static void pattern17(int n){
        for(int i = 1; i <=n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i ==1 || i == n ||j == 1|| j == n|| i==j|| i+j == n+1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
