import java.util.*;

public class deleteMiddleOfStack {
    public static void deleteMid(Stack<Integer> s,int k){
        if(k==1){
          s.pop();
          return;
        }
        int t=s.peek();
        s.pop();
        deleteMid(s, k-1);
        s.push(t);
        return;
    }
    public static void delete(Stack<Integer> s){
        int n=s.size()/2;
        deleteMid(s,n);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(0);
        s.push(6);
        s.push(60);
        s.push(7);
        s.push(100);
        s.push(500);
        delete(s);
        System.out.println(s);
    }
}
