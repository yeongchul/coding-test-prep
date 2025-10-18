package Lv1;

public class PYCount {
    class Solution {
        boolean solution(String s) {
            String[] c = s.split("");

            int pCount = 0;
            int yCount = 0;

            for (String ch : c) {
                if (ch.toLowerCase().equals("p")) pCount++;
                if (ch.toLowerCase().equals("y")) yCount++;
            }

            if (pCount == yCount) return true;
            return false;
        }
    }
}
