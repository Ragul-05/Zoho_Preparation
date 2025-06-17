public class Pattern15 {
    public static void main(String[] args) {
        display(5);
    }
    static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print((n - i) + " ");
            }

            System.out.println();
        }
    }
}


