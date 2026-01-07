import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int maxDp = 0;

        for (int i=0; i<N; i++) {
            int max = 0;

            for (int j=0; j<i; j++) {
                if (A[j] < A[i]) {
                    if (max < dp[j]) max = dp[j];
                }
            }

            dp[i] = max + 1;
            if (maxDp < dp[i]) maxDp = dp[i];
        }

        System.out.println(maxDp);
    }
}
