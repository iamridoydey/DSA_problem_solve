package Math;

// Problem Link: https://leetcode.com/problems/number-complement/
public class NumberComplement {
    public static void main(String[] args) {
        int ans = findComplement(2147483647); // should be 0
        System.out.println(ans);
    }

    public static int findComplement(int num) {
        // Find the number which can make it possible to complement num
        // Just by getting the length of the num and create a number
        // that has the same length and all the bits should be 1
        int len = (int) (Math.log(num) / Math.log(2)) + 1;

        // Create the mask number
        int mask = (1 << len) - 1;

        return num ^ mask;
    }


}
