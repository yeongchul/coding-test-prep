import java.util.Scanner;

public class BaekJoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] student = new boolean[31];
        for (int i=0; i<28; i++) {
            int num = sc.nextInt();
            student[num] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<31; i++) {
            if (!student[i]) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
