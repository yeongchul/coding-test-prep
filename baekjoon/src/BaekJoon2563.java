import java.util.Scanner;

public class BaekJoon2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[100][100];
        for (int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    arr[x+j][y+k] = 1;
                }
            }
        }

        int total = 0;
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if (arr[i][j] == 1) total++;
            }
        }

        System.out.println(total);
    }
}
