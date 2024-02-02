package Math;

public class HammingDistance {
    public static void main(String[] args) {
        int ans = hammingDistance(1, 4);
        System.out.println(ans);
    }
    public static int hammingDistance(int x, int y) {
        int distance = 0;

        while (x > 0 || y > 0){
            int xDigit = x & 1;
            int yDigit = y & 1;

            if (xDigit != yDigit){
                distance++;
            }

            x >>= 1;
            y >>= 1;
        }

        return distance;
    }
}
