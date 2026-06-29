package Stack;
import java.util.Stack;

public class min_stack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();

    public void push(int val) {

        st.push(val);

        if (st1.isEmpty() || val <= st1.peek()) {
            st1.push(val);
        }
    }

    public void pop() {

        if (st.peek().equals(st1.peek())) {
            st1.pop();
        }

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return st1.peek();
    }

    public static void main(String[] args) {

        min_stack obj = new min_stack();

        obj.push(5);
        obj.push(2);
        obj.push(8);
        obj.push(1);

        System.out.println(obj.getMin());

        obj.pop();

        System.out.println(obj.getMin());
    }
}