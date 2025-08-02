import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        // N 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 상근이가 가지고 있는 카드 저장
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // M 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 상근이가 해당 카드를 몇 개 가지고 있는지
        StringBuilder sb = new StringBuilder();
        for (int j=0; j<M; j++) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(query, 0)).append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
