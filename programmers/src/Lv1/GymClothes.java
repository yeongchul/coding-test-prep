package Lv1;

import java.util.Arrays;

public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;

        int[] clothes = new int[n+2];
        Arrays.fill(clothes, 1);

        for (int i : lost) clothes[i]--;
        for (int i : reserve) clothes[i]++;

        for (int i=0; i<=n; i++) {
            if (clothes[i] == 0) {
                if (clothes[i-1] > 1) {
                    clothes[i-1]--;
                    clothes[i]++;
                } else if (clothes[i+1] > 1) {
                    clothes[i+1]--;
                    clothes[i]++;
                } else {
                    result++;
                }
            }
        }

        return n - result;
    }
}
