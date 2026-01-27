import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        for (int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            boolean swap = false;

            for (int i=1; i<5; i++) {
                if (arr[i-1] > arr[i]) {
                    swap = true;

                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;

                    StringBuilder sb = new StringBuilder();
                    for (int j=0; j<5; j++) {
                        sb.append(arr[j]).append(" ");
                    }
                    System.out.println(sb);
                }
            }

            if (!swap) return;
        }
    }
}
