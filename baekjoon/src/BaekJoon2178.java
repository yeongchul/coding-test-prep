import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] num = bf.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        int[][] arr = new int[N][M];

        for (int i=0; i<N; i++) {
            String line = bf.readLine();

            for (int j=0; j<M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        boolean[][] visited = new boolean[N][M];
        int[][] dist = new int[N][M];
        for (int i=0; i<N; i++) {
            Arrays.fill(visited[i], false);
            Arrays.fill(dist[i], 0);
        }
        visited[0][0] = true;
        dist[0][0] = 1;

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0});

        while (!deque.isEmpty()) {
            int[] now = deque.poll();
            int x = now[0];
            int y = now[1];

            if (x==N-1 && y==M-1) {
                System.out.print(dist[x][y]);
                return;
            }

            // 상하좌우
            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx > N-1 || ny < 0 || ny > M-1) continue;
                if (nx == 0 && ny == 0) continue;

                if (!visited[nx][ny] && arr[nx][ny] == 1) {
                    deque.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1;
                }
            }
        }
    }
}
