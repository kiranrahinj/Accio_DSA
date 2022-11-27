import java.util.*;

class removeDuplicates {

    public static void insert(List<Integer> a, int val) {
        if (a.size() == 0 || a.get(a.size() - 1) <= val) {
            a.add(val);
            return;
        }
        int temp = a.get(a.size() - 1);
        a.remove(a.size() - 1);
        insert(a, val);
        a.add(temp);
        return;
    }

    public static void sort(List<Integer> a) {
        if (a.size() == 0) {
            return;
        }
        int val = a.get(a.size() - 1);
        a.remove(a.size() - 1);
        sort(a);
        insert(a, val);

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(20);
        a.add(10);
        a.add(20000);
        a.add(0);
        a.add(1);

        sort(a);

        System.out.println(a);
    }
}