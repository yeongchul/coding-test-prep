import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJoon1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] numToName = new String[N];
        Map<String, Integer> nameToNum = new HashMap<>();

        for (int i=0; i<N; i++) {
            String name = sc.next();
            numToName[i] = name;
            nameToNum.put(name, i);
        }

        for (int j=0; j<M; j++) {
            String query = sc.next();

            if (Character.isDigit(query.charAt(0))) {
                int num = Integer.parseInt(query);
                System.out.println(numToName[num-1]);
            } else {
                System.out.println(nameToNum.get(query) + 1);
            }
        }
    }
}
