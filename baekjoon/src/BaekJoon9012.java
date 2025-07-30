import java.util.Scanner;

public class BaekJoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<T; i++) {
            String line = sc.nextLine();
            int count = 0;
            boolean isValid = true;

            for (char c : line.toCharArray()) {
                if (c == '(') count++;
                else if (c == ')') count--;

                if (count < 0) {
                    isValid = false;
                    break;
                }
            }

            if (count==0 && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
