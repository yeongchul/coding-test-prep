import java.util.Scanner;

public class BaekJoon1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] count = new int[26]; // a~z

        for (int i=0; i<N; i++) {
            char c = sc.next().charAt(0);
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<26; i++) {
            if (count[i] >= 5) sb.append((char)(i + 'a'));
        }

        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }
}
