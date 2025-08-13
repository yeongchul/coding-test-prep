import java.util.*;

public class BaekJoon1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> book = new HashMap<>();

        for (int i=0; i<num; i++) {
            String title = sc.nextLine();
            book.put(title, book.getOrDefault(title, 0)+1);
        }

        int max = Collections.max(book.values());

        List<String> candidates = new ArrayList<>();
        for (String key : book.keySet()) {
            if(book.get(key) == max) {
                candidates.add(key);
            }
        }

        Collections.sort(candidates);
        System.out.println(candidates.get(0));
    }
}
