public class Pattern19 {
    public static void main(String[] args) {
        //  1 2 3
        //  8 9 4
        //  7 6 5
        display(3);
    }
    static void display(int n) {
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int dir = 0; 
        int count = 1;
        int total = n * n;
        while (count <= total) {
            if (dir == 0) { // left to right
                for (int i = left; i <= right; i++) {
                    System.out.printf("%-3d", count++);
                }
                top++;
            } else if (dir == 1) { // top to bottom
                for (int i = top; i <= bottom; i++) {
                    printAt(i, right, n, count++);
                }
                right--;
            } else if (dir == 2) { // right to left
                for (int i = right; i >= left; i--) {
                    printAt(bottom, i, n, count++);
                }
                bottom--;
            } else if (dir == 3) { // bottom to top
                for (int i = bottom; i >= top; i--) {
                    printAt(i, left, n, count++);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
    }
    static void printAt(int row, int col, int n, int val) {
        if (col == 0) System.out.println(); 
        System.out.printf("%-3d", val);
    }
}