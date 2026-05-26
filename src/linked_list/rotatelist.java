package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class rotatelist {
	node head;
	node tail;
public node rotate(int k) {
	 if(head == null || head.next == null){
         return head;
     }
	node slow=head;
	node fast=head;
	for(int i=0;i<k+1;i++) {
		fast=fast.next;
	}
	while(fast.next!=null) {
		slow=slow.next;
		 fast=fast.next;
	}
	node a=slow.next;
	slow.next=null;
	node tail=a;
	while(tail.next!=null) {
		tail=tail.next;
	}
	tail.next=head;
	return a;
	
}
public void insert(int value) {
	node nn=new node(value);
	if(head==null) {
		head=tail=nn;
		return;
	}
	tail.next=nn;
	tail=nn;
	
}
public void display(node head) {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ->");
		temp=temp.next;
	}
	 System.out.println("null");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotatelist k=new rotatelist();
		k.insert(10);
		k.insert(20);
		k.insert(30);
		k.insert(40);
		k.insert(50);
		k.display(k.head);
		node ans=k.rotate(2);
		k.display(ans);

	}

}
