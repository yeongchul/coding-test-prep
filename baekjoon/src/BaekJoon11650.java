import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x
            points[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; // y축 오름차순
            } else {
                return a[0] - b[0]; // x축 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
