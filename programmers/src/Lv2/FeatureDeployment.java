package Lv2;

import java.util.ArrayList;
import java.util.List;

public class FeatureDeployment {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> res = new ArrayList<>();

        int standard = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int count = 1;

        for (int i=1; i<progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (day <= standard) count++;
            else {
                res.add(count);
                count = 1;
                standard = day;
            }
        }
        res.add(count);

        return res.stream().mapToInt(x -> x).toArray();
    }
}
