import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int x = 0;

            if (!cmd.equals("all") && !cmd.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "add":
                    set[x] = true;
                    break;
                case "remove":
                    set[x] = false;
                    break;
                case "check":
                    sb.append(set[x] ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    set[x] = !set[x];
                    break;
                case "all":
                    Arrays.fill(set, true);
                    break;
                case "empty":
                    Arrays.fill(set, false);
                    break;
            }
        }
        System.out.print(sb);
    }
}
