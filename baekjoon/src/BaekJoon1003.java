import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        one[0] = 0;
        zero[1] = 0;
        one[1] = 1;

        for (int j=2; j<=40; j++) {
            zero[j] = one[j-1];
            one[j] = one[j-1] + one[j-2];
        }

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(zero[num] + " " + one[num]);
        }
    }
}
