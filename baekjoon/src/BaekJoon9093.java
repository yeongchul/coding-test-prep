import java.util.Scanner;

public class BaekJoon9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        String[] str = new String[num];
        for (int i=0; i<num; i++) {
            str[i] = sc.nextLine();
        }

        for (int i=0; i<num; i++) {
            String[] arr = str[i].split(" ");

            for (String s : arr) {
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}
