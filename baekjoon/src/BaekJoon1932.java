import java.util.Scanner;

public class BaekJoon1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] triangle = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];

        for (int i=1; i<n; i++) {
            // 왼쪽
            dp[i][0] = dp[i-1][0] + triangle[i][0];

            // 오른쪽
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];

            // 가운데
            for (int j=1; j<i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
        }

        int max = 0;
        for (int i=0; i<n; i++) {
            if (max < dp[n-1][i]) max = dp[n-1][i];
        }

        System.out.println(max);
    }
}
