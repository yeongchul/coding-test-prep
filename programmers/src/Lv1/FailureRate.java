package Lv1;

import java.util.Arrays;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] failCnt = new int[N+2];
        for (int i : stages) failCnt[i]++;

        double[] fail = new double[N+1];
        int remain = stages.length;

        for (int i=1; i<=N; i++) {
            if (remain == 0) fail[i] = 0.0;
            else {
                fail[i] = (double) failCnt[i] / remain;
                remain = remain - failCnt[i];
            }
        }

        Integer[] order = new Integer[N];
        for (int i=0; i<N; i++) order[i] = i + 1;

        Arrays.sort(order, (a, b) -> {
            if (fail[a] == fail[b]) return a - b;
            return Double.compare(fail[b], fail[a]);
        });

        int[] answer = new int[N];
        for (int i=0; i<N; i++) answer[i] = order[i];

        return answer;
    }
}
