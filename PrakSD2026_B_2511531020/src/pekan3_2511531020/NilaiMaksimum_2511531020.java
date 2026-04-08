package pekan3_2511531020;

import java.util.Stack;

public class NilaiMaksimum_2511531020 {
    public static int max_2511531020(Stack<Integer> s) {
        Stack<Integer> backup = new Stack<Integer>();
        int maxValue_2511531020 = s.pop();
        backup.push(maxValue_2511531020);
        while (!s.isEmpty()) {
            int next = s.pop();
            backup.push(next);
            maxValue_2511531020 = Math.max(maxValue_2511531020, next);
        }
        while (!backup.isEmpty()) {
            s.push(backup.pop());
        }
        return maxValue_2511531020;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(70);
        s.push(12);
        s.push(20);
        System.out.println("isi stack " + s);
        System.out.println("Stack Teratas " + s.peek());
        System.out.println("Nilai maksimum " + max_2511531020(s));
    }
}
