import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수

        long[] lines = new long[K];
        long max = 0;

        for (int i=0; i<K; i++) {
            lines[i] = Long.parseLong(br.readLine());
            if (lines[i] > max) {
                max = lines[i]; // 가장 긴 랜선 길이
            }
        }

        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (long line : lines) {
                count = count + (line / mid);
            }

            if (count >= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.print(answer);
    }
}
