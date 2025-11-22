import java.util.*;

public class BaekJoon17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean isTag = false;

        for (int i=0; i<st.length(); i++) {
            char c = st.charAt(i);

            if (c == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c);
                isTag = true;
            } else if (c == '>') {
                sb.append(c);
                isTag = false;
            } else if (!isTag) {
                if (c == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(c);
                } else {
                    stack.push(c);
                }
            } else sb.append(c);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
