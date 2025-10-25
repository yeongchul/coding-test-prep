package Lv1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    public int[] solution(int[] answers) {
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};

        int s1 = 0, s2 = 0, s3 = 0;

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == (i%5)+1) s1++;
            if (answers[i] == p2[i%8]) s2++;
            if (answers[i] == p3[i%10]) s3++;
        }

        int max = Math.max(s1, Math.max(s2, s3));

        List<Integer> winner = new ArrayList<>();

        if (max == s1) winner.add(1);
        if (max == s2) winner.add(2);
        if (max == s3) winner.add(3);

        int[] answer = new int[winner.size()];
        for (int i=0; i<winner.size(); i++) answer[i] = winner.get(i);

        return answer;
    }
}
