package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class reversell {
	node head;
	node tail;
public void reverse() {
	node curr=head;
	node prev=null;
	node next=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		
	}
	head=prev;
	
}
public void insert(int val) {
	node nn=new node(val);
	if(head==null) {
		head=tail=nn;
		return;
	}
	tail.next=nn;
	tail=nn;
}
public void display() {
	node temp=head;
	if(head==null) {
		System.out.println("list is empty");
		return;
	}
	while(temp!=null) {
		System.out.print(temp.data +"->");

		temp=temp.next;
	}
    System.out.println("null");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversell list=new reversell();
	list.insert(10);
	list.insert(20);
	list.insert(40);
	list.insert(50);
	list.display();
	list.reverse();
	list.display();



	}

}
