import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine()); // 테스트 케이스

        for (int k=0; k<T; k++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(st.nextToken()); // 가로 길이
            int N = Integer.parseInt(st.nextToken()); // 세로 길이
            int K = Integer.parseInt(st.nextToken()); // 배추 개수

            int[][] cabbage = new int[M][N];
            int[][] visited = new int[M][N];

            for (int i=0; i<K; i++) {
                st = new StringTokenizer(bf.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                cabbage[a][b] = 1;
            }

            int earthworm = 0;

            for (int i=0; i<M; i++) {
                for (int j=0; j<N; j++) {
                    if (cabbage[i][j] == 1 && visited[i][j] == 0) {
                        dfs(cabbage, visited, i, j, M, N);
                        earthworm++;
                    }
                }
            }

            System.out.println(earthworm);
        }
    }

    static void dfs(int[][] cabbage, int[][] visited, int i, int j, int M, int N) {
        visited[i][j] = 1;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int k=0; k<4; k++) {
            if (i + dx[k] >= 0 && i + dx[k] < M && j + dy[k] >= 0 && j + dy[k] < N) {
                if (visited[i + dx[k]][j + dy[k]] == 0  && cabbage[i + dx[k]][j + dy[k]] == 1) {
                    dfs(cabbage, visited, i + dx[k], j + dy[k], M, N);
                }
            }
        }
    }
}
