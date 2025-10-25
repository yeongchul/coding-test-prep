package Lv2;

import java.util.Arrays;

public class LargestNumber {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));

        StringBuilder sb = new StringBuilder();
        for (int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }

        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}
