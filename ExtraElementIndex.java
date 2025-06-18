public class ExtraElementIndex {
    public static int findExtra(int[] a, int[] b) {
        int n = b.length;
        for (int i = 0; i < n; i++) {
            if (a[i]!=b[i]) {
                return i;
            }
        }
        return a.length - b.length == 0 ? -1 : n;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 4, 6, 8,10, 12,14};
        int[] b1 = {2, 4, 6, 8, 10, 12};
        System.out.println(findExtra(a1, b1));
    }
}