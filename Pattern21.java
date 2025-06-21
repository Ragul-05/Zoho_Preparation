public class Pattern21 {
    public static void main(String[] args) {
        // 1 10 11 20 21
        // 2  9 12 19 22
        // 3  8 13 18 23
        // 4  7 14 17 24
        // 5  6 15 16 25
        display(5);
    }

    static void display(int n){
        for(int  i=0 ; i < n ; i++){
            int inc = i + 1;
            for(int j = 0 ; j< n; j++){
                System.out.printf("%-3d", inc);
                if(j % 2 == 0){
                    inc += (n*2) -(i*2+1);
                }
                else{
                    inc += (i*2+1);
                }
            }
            System.out.println();
        }
    }
}
