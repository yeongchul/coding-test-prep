import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 수

        for (int i=0; i<T; i++) {
            int n = sc.nextInt(); // 의상의 수
            Map<String, Integer> clothes = new HashMap<>();

            for (int j=0; j<n; j++) {
                String name = sc.next(); // 옷 이름
                String type = sc.next(); // 옷 종류

                clothes.put(type, clothes.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int count : clothes.values()) {
                result = result * (count + 1);
            }
            System.out.println(result - 1); // 아무것도 안 입은 경우 제외
        }

        sc.close();
    }
}
