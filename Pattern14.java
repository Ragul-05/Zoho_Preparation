public class Pattern14 {
    public static void main(String[] args) {

        pattern14(13);
    }
    static void pattern14(int n) {
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.max(Math.abs(i - (n - 1)), Math.abs(j - (n - 1))) + 1;
                System.out.printf( "%3s", layer + " ");
            }
            System.out.println();
        }
    }
}
