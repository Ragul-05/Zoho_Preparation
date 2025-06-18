import java.util.Scanner;

public class TwistedPrime {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        System.out.println(isTwistedPrime(number));

    }
    
    static int isTwistedPrime(int n){
        if (!isPrime(n)) return 0;
        int rev = reverse(n);
        return isPrime(rev) ? 1 : 0;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
