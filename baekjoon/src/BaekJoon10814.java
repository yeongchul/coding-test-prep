import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon10814 {
    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Member> members = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int age = sc.nextInt();
            String name = sc.next();

            members.add(new Member(age, name));
        }

        members.sort((m1, m2) -> m1.age - m2.age);

        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
