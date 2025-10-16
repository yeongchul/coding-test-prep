import java.util.*;

public class BaekJoon1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=0; i<M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i=0; i<=N; i++) {
            graph.get(i).sort(null);
        }

        boolean[] visited = new boolean[N+1];
        for (int i=0; i<=N; i++) {
            visited[i] = false;
        }

        dfs(V, graph, visited);
        Arrays.fill(visited, false);

        System.out.println();
        bfs(V, graph, visited);
    }

    static void dfs(int V, List<List<Integer>> graph, boolean[] visited) {
        visited[V] = true;
        System.out.print(V + " ");

        for (int u : graph.get(V)) {
            if (!visited[u]) {
                dfs(u, graph, visited);
            }
        }
    }

    static void bfs(int V, List<List<Integer>> graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int next : graph.get(cur)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
