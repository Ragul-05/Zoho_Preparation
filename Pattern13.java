import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {

        /*
         *  1
            2   3
            4   5   6
            7   8   9  10
           11  12  13  14  15
           16  17  18  19
           20  21  22
           23  24
            25
         */
        int n = 5;
        int value = 1;
        for (int d = 0; d < 2 * n - 1; d++) {
            int row, col;
            if (d % 2 == 0) {
                row = Math.min(d, n - 1);
                col = d - row;
                while (row >= 0 && col < n) {
                    System.out.printf("%4d", value++);
                    row--;
                    col++;
                }
            } else {
                col = Math.min(d, n - 1);
                row = d - col;
                while (col >= 0 && row < n) {
                    System.out.printf("%4d", value++);
                    row++;
                    col--;
                }
            }
            System.out.println();
        }
    }
}


