package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        String ans = longestCommonPrefix(arr);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] strs) {
        int N = strs.length;
        int n = strs[0].length();
        int len = 0;

        // Edge cases
        if (N == 0){
            return "";
        }

        for(int i = 0; i < n; i++){
            // Letter of the first word
            char fWLetter = strs[0].charAt(i);

            boolean noMatch = false;

            for (int j = 1; j < N; j++){
                // Every words letter except first word
                char eWLetter = strs[j].charAt(i);

                // Check whether every word has this letter in the same position then move ahead
                if ((fWLetter != eWLetter) && len == 0){
                    return "";
                } else if (fWLetter != eWLetter){
                    noMatch = true;
                }
            }

            // Check whether first letter is match or not
            // If it is not then break the loop
            if (noMatch){
                break;
            } else {
                len++;
            }
        }


        return strs[0].substring(0, len);
    }
}
