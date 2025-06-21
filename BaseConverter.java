public class BaseConverter {
    public static void main(String[] args) {
        int num1 = 58;
        int base1 = 16;
        int num2 = 58;
        int base2 = 23;

        System.out.println("Base " + base1 + ": " + convertToBase(num1, base1)); // 3A
        System.out.println("Base " + base2 + ": " + convertToBase(num2, base2)); // 2C
    }

    static String convertToBase(int num, int base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % base;
            if (rem < 10)
                sb.append((char)(rem + '0'));
            else
                sb.append((char)(rem - 10 + 'A')); // 10 -> A, 11 -> B, ..., 35 -> Z
            num /= base;
        }
        return sb.reverse().toString();
    }
}
