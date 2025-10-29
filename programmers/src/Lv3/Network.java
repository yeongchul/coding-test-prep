package Lv3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Network {
    boolean[] visited;

    // dfs 풀이
    public int solutionDfs(int n, int[][] computers) {
        visited = new boolean[n];
        Arrays.fill(visited, false);

        int answer = 0;
        for (int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(n, i, computers);
                answer++;
            }
        }

        return answer;
    }

    void dfs(int n, int cur, int[][] computers) {
        visited[cur] = true;

        for (int i=0; i<n; i++) {
            if (computers[cur][i]==1 && !visited[i]) dfs(n, i, computers);
        }
    }

    // bfs 풀이
    public int solutionBfs(int n, int[][] computers) {
        visited = new boolean[n];
        Arrays.fill(visited, false);

        int answer = 0;
        for (int i=0; i<n; i++) {
            if(!visited[i]) {
                bfs(i, n, computers);
                answer++;
            }
        }

        return answer;
    }

    void bfs(int cur, int n, int[][] computers) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(cur);
        visited[cur] = true;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            visited[now] = true;

            for (int i=0; i<n; i++) {
                if (!visited[i] && computers[now][i] == 1) {
                    deque.offer(i);
                }
            }
        }
    }
}
