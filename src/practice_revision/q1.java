package practice_revision;

public class q1 {
int rear=-1;
int front=0;
int size=0;
int arr[]=new int[5];
public void enqueue(int val) {
	if(rear==arr.length-1) {
		System.out.println("OVERFLOW");
		return;
	}
	rear++;
	arr[rear]=val;
	size++;
}
public int dequeue() {
	if(size==0) {
		System.out.println("NOTHING TO DELETE");
		return -1;
	}
	int del=arr[front];
	front++;
	size--;
	return del;
	
}
public void peek() {
	if(size==0) {
		System.out.println("NOTHING TO PEEK");
		return;
	}
	System.out.println(arr[front]);
}
public void display() {
	for(int i=front;i<=rear;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1 q=new q1();
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(0);
		
		q.dequeue();
		q.display();
		q.peek();
		q.display();

		
		

	}

}
