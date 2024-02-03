package Math;
// Problem Link: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/
public class PrimeNumberOfSetBits {
    public static void main(String[] args) {
        int ans = countPrimeSetBits(5, 10);
        System.out.println(ans);
    }

    public static int countPrimeSetBits(int left, int right) {
        int primes = 0;
        for (int i = left; i <= right; i++){
            int bits = setBits(i);
            if (isPrime(bits)) primes++;
        }

        return primes;
    }

    public static int setBits(int n){
        int bits = 0;

        while (n != 0){
            if ((n & 1) == 1){
                bits++;
            }

            n >>= 1;
        }

        return bits;
    }


    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
