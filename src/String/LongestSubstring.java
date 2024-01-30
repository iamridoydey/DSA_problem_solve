package String;

import java.util.HashSet;

class LongestSubstring {
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("pwwkew");
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        // HashSet to store unique value
        HashSet<Character> set = new HashSet<>();

        // Pointers
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()){
            char ch = s.charAt(j);

            if (set.contains(ch)) {
                // Find the position of 'ch' in the set
                while (s.charAt(i) != ch) {
                    set.remove(s.charAt(i));
                    i++;
                }
                // Remove 'ch' from the set
                set.remove(ch);
                // Move the window forward
                i++;
            }

            set.add(ch);
            j++;
            max = Math.max(max, set.size());
            
        }

        return max;
    }
}