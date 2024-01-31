package Math;
// Problem Link: https://leetcode.com/problems/add-binary/submissions/1161992475/
public class AddBinary {
    public static void main(String[] args) {
        String a = "11111";
        String b = "100";
        String ans = addBinary(a, b); // 100011
        System.out.println(ans);
    }

    public static String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0){
            int sum = carry;

            if (i >= 0){
                sum += a.charAt(i) - '0';
            }

            if (j >= 0){
                sum += b.charAt(j) - '0';
            }

            ans.insert(0, sum % 2);

            carry = sum / 2;
            i--;
            j--;
        }

        if (carry != 0){
            ans.insert(0, carry);
        }

        return ans.toString();
    }


}
