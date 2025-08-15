import java.util.Scanner;

public class BaekJoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        int[] count = new int[26];

        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            count[c - 'A']++;
        }

        int max = -1;
        char result = '?';
        for (int i=0; i<26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char)(i+'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
