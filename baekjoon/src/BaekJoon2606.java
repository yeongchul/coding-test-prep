import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BaekJoon2606 {
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int M = Integer.parseInt(br.readLine()); // 컴퓨터 쌍의 수

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++) {
            String[] line = br.readLine().split(" ");
            graph.get(Integer.parseInt(line[0])).add(Integer.parseInt(line[1]));
            graph.get(Integer.parseInt(line[1])).add(Integer.parseInt(line[0]));
        }

        visited = new boolean[N+1];
        bfs(graph);

        int total = 0;
        for (int i=2; i<=N; i++) {
            if (visited[i]) {
                total = total + 1;
            }
        }

        System.out.println(total);
    }

    static void bfs(List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        visited[1] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            visited[cur] = true;

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    queue.offer(next);
                }
            }
        }
    }
}
