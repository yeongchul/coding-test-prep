import java.io.IOException;
import java.util.Scanner;

public class BaekJoon11659 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        arr[0] = sc.nextInt();
        for (int i=1; i<N; i++) {
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for (int k=0; k<M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            if (i == 1) {
                System.out.println(arr[j-1]);
            } else {
                System.out.println(arr[j-1] - arr[i-2]);
            }
        }
    }
}
