import java.util.*;

public class BaekJoon2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        // 산술 평균
        int avg = 0;
        for (int i=0; i<N; i++) {
            avg = avg + numbers[i];
        }
        System.out.println(Math.round((double) avg / N));

        // 중앙값
        System.out.println(numbers[N/2]);

        // 최빈값
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i=0; i<N; i++) {
            freq.put(numbers[i], freq.getOrDefault(numbers[i], 0) + 1);
        }

        // 최빈값 빈도 구하기
        int maxFreq = 0;
        for(int value : freq.values()) {
            maxFreq = Math.max(maxFreq, value);
        }

        // 최빈값 리스트
        List<Integer> list = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) == maxFreq) {
                list.add(key);
            }
        }
        Collections.sort(list);

        // 출력
        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(1));
        }

        // 범위
        System.out.println(numbers[N-1] - numbers[0]);
    }
}
