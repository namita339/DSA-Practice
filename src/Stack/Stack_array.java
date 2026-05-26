package Stack;

public class Stack_array {
int arr[]=new int[5];
int top=-1;
public void push(int val) {
	if(top==arr.length) {
		System.out.println("overflow");
		return;
	}
	top++;
	arr[top]=val;
}
public void pop() {
	if(top==-1) {
		System.out.println("underflow");
		return;
	}
	top--;
}
public void peek() {
	if(top==-1) {
		System.out.println("underflow");
		return;
	}
	System.out.println(arr[top]);
}
public void display() {
	for(int i=top;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_array list=new Stack_array();
		list.push(1);
		list.push(2);
		list.push(4);
		list.push(5);
		list.push(6);
	
		list.pop();
		list.display();

	}

}
