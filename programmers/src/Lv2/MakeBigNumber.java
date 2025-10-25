package Lv2;

import java.util.Stack;

public class MakeBigNumber {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            int now = number.charAt(i) - '0';

            while (!stack.isEmpty() && stack.peek() < now && k > 0) {
                stack.pop();
                k--;
            }

            stack.add(now);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : stack) sb.append(i);

        return sb.toString();
    }
}
