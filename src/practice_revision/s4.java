package practice_revision;
import java.util.*;
public class s4 {
	 private Stack<Integer> stack;
	    private Stack<Integer> minStack;

	    public s4() {
	        stack = new Stack<>();
	        minStack = new Stack<>();
	    }

	    public void push(int x) {
	        stack.push(x);
	        if (minStack.isEmpty() || x <= minStack.peek()) {
	            minStack.push(x);
	        }
	    }

	    public void pop() {
	        if (stack.peek().equals(minStack.peek())) {
	            minStack.pop();
	        }
	        stack.pop();
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return minStack.peek();
	    }

	    public static void main(String[] args) {
	        s4 ms = new s4();
	        ms.push(5);
	        ms.push(2);
	        ms.push(8);
	        ms.push(1);
	        System.out.println("Min: " + ms.getMin()); // 1
	        ms.pop();
	        System.out.println("Min now: " + ms.getMin()); // 2
	    }
	}
