import java.util.*;

public class BaekJoon1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 듣도 못한 사람
        int m = sc.nextInt(); // 보도 못한 사람

        Set<String> unheard = new HashSet<>(); // 듣도 못한 사람 리스트
        List<String> result = new ArrayList<>(); // 듣도 보도 못한 사람 리스트

        // 듣도 못한 사람 저장
        for (int i=0; i<n; i++) {
            unheard.add(sc.next());
        }

        for (int j=0; j<m; j++) {
            String name = sc.next();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        // 사전순으로 정리
        Collections.sort(result);

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}
