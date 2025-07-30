import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i=1; i<=Math.sqrt(p); i++) {
            if (p % i == 0) {
                divisors.add(i);
                if (p/i != i) {
                    divisors.add(p/i);
                }
            }
        }

        Collections.sort(divisors);

        if (divisors.size() < q) {
            System.out.print(0);
        } else {
            System.out.print(divisors.get(q - 1));
        }
    }
}
