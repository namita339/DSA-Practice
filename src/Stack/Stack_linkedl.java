package Stack;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Stack_linkedl {
node head;
public void push(int val) {

    node nn = new node(val);

    if(head == null) {
        head = nn;
        return;
    }

    nn.next = head;
    head = nn;
}
public void pop() {
	if(head==null) {
		System.out.println("nothing to delete");
		return;
	}
	head=head.next;
}
public void display() {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.data +"");
		temp=temp.next;
	}
}
public void peek() {

    if(head == null) {
        System.out.println("Stack is Empty");
        return;
    }

    System.out.println(head.data);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_linkedl list=new Stack_linkedl();
		list.push(20);
		list.push(50);
		list.push(70);
		list.push(90);
		
		list.pop();
		list.display();



	}

}
