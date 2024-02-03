package Math;
// Problem Link: https://leetcode.com/problems/binary-number-with-alternating-bits/
public class BinaryWithAlteringBits {
    public static void main(String[] args) {
        boolean ans = hasAlternatingBits(5);
        System.out.println(ans);
    }
    public static boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;

        while (n != 0){
            int curr = n & 1;

            if (curr == prev) {
                return false;
            }

            prev = curr;

            n >>= 1;
        }

        return true;
    }
}
