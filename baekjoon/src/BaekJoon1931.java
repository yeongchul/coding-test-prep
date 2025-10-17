import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaekJoon1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<int[]> meeting = new ArrayList<>();
        for (int i=0; i<N; i++) {
            String[] line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0]);
            int end = Integer.parseInt(line[1]);

            meeting.add(new int[]{start, end});
        }

        Collections.sort(meeting, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int total = 0;
        int lastEnd = 0;
        for (int[] m : meeting) {
            if (m[0] >= lastEnd) {
                total++;
                lastEnd = m[1];
            }
        }

        System.out.println(total);
    }
}
