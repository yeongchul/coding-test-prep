import java.util.Scanner;

public class BaekJoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = N / 5;

        while (a >= 0) {
            int n = N - 5 * a;

            if (n % 3 == 0) {
                System.out.println(a + (n / 3));
                return;
            }

            a--;
        }

        System.out.println(-1);
    }
}
