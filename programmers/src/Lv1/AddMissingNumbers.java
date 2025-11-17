package Lv1;

public class AddMissingNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i=0; i<numbers.length; i++) {
            answer = answer + numbers[i];
        }

        return 45 - answer;
    }
}
