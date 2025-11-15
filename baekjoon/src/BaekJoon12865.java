import java.util.Scanner;

public class BaekJoon12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물품 수
        int K = sc.nextInt(); // 버틸 수 있는 무게

        int[] value = new int[N+1];
        int[] weight = new int[N+1];

        for (int i=1; i<=N; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        int[][] dp = new int[N+1][K+1];

        for (int i=1; i<=N; i++) {
            for (int j=0; j<=K; j++) {
                // 넣을 수 없음
                dp[i][j] = dp[i-1][j];

                // 넣을 수 있음
                if (weight[i] <= j) {
                    dp[i][j] = Math.max(
                            dp[i-1][j], // 안 넣기
                            dp[i-1][j-weight[i]] + value[i] // 넣기
                    );
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
