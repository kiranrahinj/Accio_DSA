import java.util.Stack;

public class insertAtLast {
    public static void insert( Stack<Integer> s,int t){
        if(s.size()==0){
            s.push(t);
            return;
        }
        int temp=s.peek();
        s.pop();
        insert(s, t);
        s.push(temp);
        return;
    }

    public static void sort( Stack<Integer> s,int t){
        if(s.size()==0){
            return;
        }
        
        insert(s,t);
        return ;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(0);
        s.push(6);
        s.push(6);
        s.push(7);
        s.push(100);
        sort(s,1000);

       System.out.println(s);
    }
}
