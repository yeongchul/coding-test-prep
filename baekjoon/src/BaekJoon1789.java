import java.util.Scanner;

public class BaekJoon1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long total = 0;
        long N = 0;
        for (long i=1; i<=S; i++) {
            total = total + i;

            if (total > S) {
                break;
            }

            N++;
        }

        System.out.println(N);
    }
}
