import java.util.Scanner;

public class BaekJoon1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) return;

            int num = n;
            int reverse = 0;
            while (n != 0) {
                int d = n % 10;
                reverse = reverse * 10 + d;
                n = n / 10;
            }

            if (num == reverse) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
