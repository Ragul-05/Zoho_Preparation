public class ReverseArray {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        reverse(arr, 0, arr.length - 1);
        System.out.println(arr); 
    }

    static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
