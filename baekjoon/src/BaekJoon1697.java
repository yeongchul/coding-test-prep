import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수빈
        int X = sc.nextInt(); // 동생

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        int[] dist = new int[100001];

        queue.offer(N);
        visited[N] = true;
        dist[N] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if(cur == X) {
                System.out.println(dist[cur]);
                return;
            }

            int[] nextPositions = {cur + 1, cur - 1, cur * 2};

            for (int next : nextPositions) {
                if (next < 0 || next > 100000) continue;
                if (visited[next]) continue;

                queue.offer(next);
                visited[next] = true;
                dist[next] = dist[cur] + 1;
            }
        }
    }
}
