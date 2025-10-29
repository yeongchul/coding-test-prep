package Lv2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ShortestPathInGameMap {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        for (int i=0; i<n; i++) {
            Arrays.fill(visited[i], false);
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0});

        visited[0][0] = true;
        int[][] dist = new int[n][m]; // 거리 길이
        dist[0][0] = 1;

        // 상하좌우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!deque.isEmpty()) {
            int[] cur = deque.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == n-1 && y == m-1) return dist[x][y];

            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue; // 범위를 벗어났을 때
                if (nx == 0 && ny == 0) continue;

                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    deque.offer(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }

        return -1;
    }
}
