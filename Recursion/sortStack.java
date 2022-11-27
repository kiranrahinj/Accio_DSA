import java.util.*;

public class sortStack {
    public static void insert(Stack<Integer> s, int t) {
        if (s.size() == 0 || s.peek() <= t) {
            s.push(t);
            return;
        }
        int temp = s.peek();
        s.pop();
        insert(s, t);
        s.push(temp);
    }

    public static void sort(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int temp = s.peek();
        s.pop();
        sort(s);

        insert(s, temp);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(0);
        s.push(6);
        s.push(6);
        s.push(7);
        s.push(100);
        sort(s);
        System.out.println(s);
    }
}
