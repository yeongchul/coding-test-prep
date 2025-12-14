package Lv1;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
                sb.append("L");
                left = numbers[i];
            } else if (numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
                sb.append("R");
                right = numbers[i];
            } else {
                int target = numbers[i];
                if (target == 0) target = 11;

                int leftRow = (left - 1) / 3;
                int leftCol = (left - 1) % 3;

                int rightRow = (right - 1) / 3;
                int rightCol = (right - 1) % 3;

                int targetRow = (target - 1) / 3;
                int targetCol = (target - 1) % 3;

                int leftDist = Math.abs(targetRow - leftRow) + Math.abs(targetCol - leftCol);
                int rightDist = Math.abs(targetRow - rightRow) + Math.abs(targetCol - rightCol);

                if (leftDist < rightDist) {
                    sb.append("L");
                    left = target;
                } else if (leftDist > rightDist) {
                    sb.append("R");
                    right = target;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = target;
                    } else {
                        sb.append("L");
                        left = target;
                    }
                }
            }
        }

        return sb.toString();
    }
}
