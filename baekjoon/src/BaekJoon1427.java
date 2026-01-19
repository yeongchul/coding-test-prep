import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] arr = new int[line.length()];

        for (int i=0; i<line.length(); i++) {
            arr[i] = line.charAt(i) - '0';
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i=line.length()-1; i>=0; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
