public class Pattern20 {
    public static void main(String[] args) {
        // 1  6 11 16 21
        // 2  7 12 17 22
        // 3  8 13 18 23
        // 4  9 14 19 24
        // 5 10 15 20 25
        display(5);

    }
    static void display(int n){
        for(int i = 1 ; i <=n; i++){
            int inc = i;
            for(int j = 1;j<=n; j++){
                System.out.printf("%-3d", inc);
                inc+=n;
            }
            System.out.println();
        }
    }
}
