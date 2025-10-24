package Lv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class TruckBridgeSimulation {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<bridge_length; i++) queue.offerLast(0);

        int time = 0; // 경과 시간
        int current = 0; // 다리 위 무게
        int i = 0;

        while (i < truck_weights.length || current > 0) {
            time++;

            current = current - queue.pollFirst();

            if (i<truck_weights.length && current + truck_weights[i] <= weight) {
                queue.addLast(truck_weights[i]);
                current = current + truck_weights[i];
                i++;
            }
            else {
                queue.addLast(0);
            }
        }

        return time;
    }
}
