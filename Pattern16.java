class Pattern16{
    public static void main(String[] args) {
        pattern16(5);
    }

    static void pattern16(int n){
        int s = n - 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < s; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            s--;
            System.out.println();
        }

        s = 0;
        for(int i = n ; i > 0 ; i--){
            for(int j = 0; j < s; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            s++;
            System.out.println();
        }
    }
}