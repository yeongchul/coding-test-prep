import java.util.*;

public class BaekJoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        for (String a : list) {
            System.out.println(a);
        }
    }
}
