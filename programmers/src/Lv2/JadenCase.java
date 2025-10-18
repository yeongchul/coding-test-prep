package Lv2;

public class JadenCase {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isWordStart = true;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(' ');
                isWordStart = true;
            } else if (isWordStart) {
                sb.append(Character.toUpperCase(c));
                isWordStart = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}
