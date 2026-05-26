package linked_list;
class node{
	int data;
	 node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class mergesort {
	node head;
	node tail;
	public node mergesort(node head) {
		node slow=head;
		node fast=head.next;
		if(head.next==null|| head==null) {
			return head;
		}
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		node a =slow.next;
		slow.next=null;
		node h1=mergesort(head);
		node h2=mergesort(a);
		return merge(h1,h2);
	}
	public node merge(node head1,node head2) {
		node dummy=new node(-1);
		node curr=dummy;
		node i=head1;
		node j=head2;
		node k=curr;
		while(i!=null && j!=null) {
			if(i.data<j.data) {
				k.next=i;
				i=i.next;
				k=k.next;
			}else {
				k.next=j;
				j=j.next;
				k=k.next;
			}
			if(i==null) {
				k.next=j;
			}else {
				k.next=i;
			}
		}
		return dummy.next;
	}
	
public void insert(int val) {
	
	node nn=new node(val);
	if(head==null) {
		head=tail=nn;
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
		mergesort l=new mergesort();
		l.insert(50);
		l.insert(20);
		l.insert(40);
		l.insert(80);
		l.insert(10);
		l.insert(70);
		l.insert(30);
		l.insert(60);
		  System.out.println("Before Sorting:");
	        l.display(l.head);
		
	        l.head = l.mergesort(l.head);

	        System.out.println("After Sorting:");
	        l.display(l.head);

	}
}
