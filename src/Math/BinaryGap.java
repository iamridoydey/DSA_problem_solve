package Math;
// Problem Link: https://leetcode.com/problems/binary-gap/
public class BinaryGap {
    public static void main(String[] args) {
        int ans = binaryGap(8);
        System.out.println(ans);
    }

    public static int binaryGap(int n) {
        int i = 0;
        int j = 0;
        int gap = 0;

        while(n != 0){
            int bit = n & 1;

            if (bit == 1){
                gap = Math.max(j - i, gap);

                if (gap != 0){
                    i = j;
                }

            } else if (i == j && gap == 0){
                i++;
            }

            j++;
            n >>= 1;
        }


        return gap;
    }
}
