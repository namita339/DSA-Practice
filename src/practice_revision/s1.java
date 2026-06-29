package practice_revision;

public class s1 {
	int top=-1;
	int arr[]=new int[5];

public void push(int val) {
	if(top==arr.length-1) {
		System.out.println("OVERFLOW");
	}
	top++;
	arr[top]=val;
}
public void pop() {
	if(top==-1) {
		System.out.println("UNDERFLOW");
	}
	System.out.println(arr[top]);
	top--;
}
public void peek() {
	if(top==-1) {
		System.out.println("STACK IS EMPTY");
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
		 s1 s=new s1();
		 s.push( 20);
		 s.push(30);
		 s.push(40);
		 s.push(90);
		 s.display();
		 s.pop();
		 s.display();
		 
		 
		 
		 
		 
		 

	}

}
