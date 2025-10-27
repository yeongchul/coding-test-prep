package Lv3;

public class TriangleMaxPath {
    public int solution(int[][] triangle) {
        int[] dp = new int[triangle.length];
        dp[0] = triangle[0][0];

        for (int i=1; i<triangle.length; i++) {
            dp[i] = dp[i-1] + triangle[i][i]; // 맨 오른쪽

            for (int j=i-1; j>=1; j--) {
                dp[j] = Math.max(dp[j-1], dp[j]) + triangle[i][j]; // 가운데
            }

            dp[0] = dp[0] + triangle[i][0]; // 맨 왼쪽
        }

        int answer = 0;
        for (int i : dp) answer = Math.max(answer, i);

        return answer;
    }
}
