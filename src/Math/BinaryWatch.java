package Math;
// Problem Link: https://leetcode.com/problems/binary-watch/

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static void main(String[] args) {
        List<String> ans = readBinaryWatch(1);
        System.out.println(ans);

    }
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList();
        for (int hours = 0; hours < 12; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
                if (Integer.bitCount(hours) + Integer.bitCount(minutes) == turnedOn){
                    StringBuilder str = new StringBuilder();

                    str.append(hours + ":");


                    if (minutes < 10){
                        str.append("0");
                    }

                    str.append(minutes);

                    ans.add(str.toString());
                }

            }
        }

        return ans;
    }
}
