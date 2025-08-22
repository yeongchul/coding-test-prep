import java.util.Scanner;

public class BaekJoon1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i=0; i<N; i++) {
            String word = sc.next();
            boolean[] seen = new boolean[26];
            char prev = 0;

            for (int j=0; j<word.length(); j++) {
                char c = word.charAt(j);

                if (prev != c) {
                    if (seen[c - 'a']) {
                        count++;
                        break;
                    } else {
                        seen[c - 'a'] = true;
                    }
                }

                prev = c;
            }
        }

        System.out.println(N-count);
    }
}
