import java.util.Scanner;
public class TallBuilding {

    public static int totalHeightOfTallBuildings(int[] H, int D) {
        int total = 0;
        int N = H.length;

        for (int i = 0; i < N; i++) {
            boolean leftValid = (i - D) >= 0;
            boolean rightValid = (i + D) < N;

            boolean leftCondition = !leftValid || H[i] > H[i - D];
            boolean rightCondition = !rightValid || H[i] > H[i + D];

            if (leftCondition && rightCondition) {
                total += H[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] heights = {1, 3, 2, 1, 5, 4};
        int D = 2;

        int result = totalHeightOfTallBuildings(heights, D);
    System.out.println("Output: " + result);
}
}