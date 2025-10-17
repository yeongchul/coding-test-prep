import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);

        int[] money = new int[N];
        for (int i=0; i<N; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int total = 0;
        for (int i=N-1; i>=0; i--) {
            total = total + (K / money[i]);
            K = K % money[i];
        }

        System.out.println(total);
    }
}
