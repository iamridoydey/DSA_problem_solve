class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("+1"));
    }
    public static int myAtoi(String s) {
        int N = s.length();
        boolean isNeg = false;

        // StringBuilder for storing valid character in place
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < N; i++){
            // Extract every character
            char ch = s.charAt(i);

            // Check whether it has -, or number from 0 till 9
            if ((ch >= 48 && ch <= 57) || ch == 45 || ch == 46){
                if (ch == '-'){
                    isNeg = true;

                } else if (str.length() == 0 && ch == 48){
                    continue;

                    // If the character is dot then just break the loop
                } else if (ch == 46){
                    break;

                } else {
                    str.append(ch);
                }

                // If char is not space character and legnth is 0 that means it contains alpha character
                // then return 0
            } else if (ch != 32 && str.length() == 0){
                return 0;
            }
        }

        // Convert this StringBuilder obj to String
        String value = str.toString();

        // If it is empty string then return 0
        if (value.length() == 0){
            return 0;
        }

        // If the value contain both +- then just return 0
        if ((s.charAt(0) == '+' && s.charAt(1) == '-') || (s.charAt(0) == '-' && s.charAt(1) == '+')){
            return 0;
        }

        // Convert the string into long
        long number = Long.parseLong(value);

        // If it has negative sign than it should convert to negative;
        if (isNeg){
            number = -number;
        }

        // Compare this number with the range of integer
        if (number < Integer.MIN_VALUE){
            number = Integer.MIN_VALUE;
        } else if (number > Integer.MAX_VALUE){
            number = Integer.MAX_VALUE;
        }

        return (int) number;

    }
}