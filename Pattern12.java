public class Pattern12 {
    public static void main(String[] args) {
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        display(5);
    }

    static void display(int n) {
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j <= (i % n); j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
