import java.util.Scanner;

public class BaekJoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] isPrime = new boolean[N+1];
        for (int i=2; i<=N; i++) {
            isPrime[i] = true;
        }

        for (int i=2; i*i<=N; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<=N; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        int sum = 0;
        int min = -1;

        for (int i=M; i<=N; i++) {
            if (isPrime[i]) {
                sum = sum + i;
                if (min == -1) {
                    min = i;
                }
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}