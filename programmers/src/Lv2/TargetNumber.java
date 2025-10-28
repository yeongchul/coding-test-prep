package Lv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class TargetNumber {
    // dfs 사용 풀이
    public int solutionDfs(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) return (sum == target) ? 1 : 0;

        int plus = dfs(numbers, target, index + 1, sum + numbers[index]);
        int minus = dfs(numbers, target, index + 1, sum - numbers[index]);

        return plus + minus;
    }

    // bfs 사용 풀이
    public int solutionBfs(int[] numbers, int target) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(0);

        for (int i=0; i<numbers.length; i++) {
            int size = queue.size();

            for (int j=0; j<size; j++) {
                int cur = queue.poll();

                queue.offer(cur + numbers[i]);
                queue.offer(cur - numbers[i]);
            }
        }

        int total = 0;
        for (int n : queue) {
            if (n == target) total++;
        }

        return total;
    }
}
