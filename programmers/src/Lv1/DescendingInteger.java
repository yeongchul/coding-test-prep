package Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingInteger {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add((int)(n % 10));
            n = n / 10;
        }

        Collections.sort(list, Collections.reverseOrder());

        long answer = 0;
        for (int i=0; i<list.size(); i++) {
            answer = answer * 10 + list.get(i);
        }

        return answer;
    }
}
