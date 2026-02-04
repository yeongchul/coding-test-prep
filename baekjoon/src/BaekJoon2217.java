import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int max = arr[0] * N;
        for (int i=1; i<N; i++) {
            int n = arr[i] * (N - i);
            if (max < n) max = n;
        }

        System.out.println(max);
    }
}
