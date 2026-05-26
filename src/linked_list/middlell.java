package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class middlell {
	node head;
	node tail;
 public node middlefind() {
	node slow=head;
	node fast=head;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;
}
 public void middledel() {
	 node prev=null;
	 node slow=head;
	 node fast=head;
	 while(fast!=null && fast.next!=null) {
		 prev=slow;
		 slow=slow.next;
		 fast=fast.next.next;
	 }
	 prev.next=slow.next;
 }
 public void insert(int value) {
	 node nn=new node(value);
	 if(head==null) {
		 head=tail=nn;
	 }
	 tail.next=nn;
	 tail=nn;
 }
 public void display() {
	 node temp=head;
	 while(temp!=null) {
		 System.out.print(temp.data+"->");
		 temp=temp.next;
	 }
	 System.out.println("null");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		middlell list=new middlell();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(60);
		list.display();
		  node middle = list.middlefind();

	        System.out.println("Middle Element: " + middle.data);
	        list.middledel();

	        System.out.println("After Deleting Middle:");
	        list.display();
	}

}
