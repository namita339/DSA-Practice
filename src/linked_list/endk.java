package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class endk {
node head;
node tail;
public node find(int k) {
	node slow=head;
	node fast=head;
	for(int i=1;i<k;i++) {
		fast=fast.next;
	}
	while(fast.next!=null) {
		slow=slow.next;
		fast=fast.next;
	}
	return slow;
}
public void delete(int k) {
	node prev=null;
	node slow=head;
	node fast=head;
	for(int i=1;i<k;i++) {
		fast=fast.next;
	}
	while(fast.next!=null) {
		prev=slow;
		slow=slow.next;
		fast=fast.next;
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
endk list=new endk();
list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);
list.insert(23);
list.insert(2);
list.display();
System.out.println(list.find(2).data);
list.delete(2);
list.display();



	}

}
