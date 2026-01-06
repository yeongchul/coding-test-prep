import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String situation = st.nextToken();

            if (situation.equals("enter")) {
                set.add(name);
            } else if (situation.equals("leave")) {
                set.remove(name);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String member : list) {
            sb.append(member).append("\n");
        }

        System.out.println(sb);
    }
}
