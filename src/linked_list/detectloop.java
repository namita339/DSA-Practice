package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class detectloop {
node head;
node tail;
public boolean loop() {
	node slow=head;
	node fast=head;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) {
			return true;
		}
	}
	return false;
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
		detectloop l=new detectloop();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(20);
		l.display();
		l.tail.next = l.head.next;
        System.out.println(l.loop());
		
		

	}

}
