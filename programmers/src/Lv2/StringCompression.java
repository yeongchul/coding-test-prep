package Lv2;

public class StringCompression {
    public int solution(String s) {
        int answer = s.length();

        for (int i=1; i<=s.length()/2; i++) {
            StringBuilder sb = new StringBuilder();

            String prev = s.substring(0, i); // 첫 문자열
            int count = 1;

            int j;
            for (j=i; j+i<=s.length(); j=j+i) {
                String cur = s.substring(j, j+i);

                if (cur.equals(prev)) {
                    count++;
                } else {
                    if (count == 1) {
                        sb.append(prev);
                    } else {
                        sb.append(count).append(prev);
                        count = 1;
                    }
                    prev = cur;
                }
            }

            // 마지막 문자열 넣기
            if (count == 1) {
                sb.append(prev);
            } else {
                sb.append(count).append(prev);
            }

            // 남은 문자열 넣기
            if (j < s.length()) sb.append(s.substring(j));

            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}
