package queue;
class node{
	int val;
	node next;
	node(int val){
		this.val=val;
		this.next=null;
	}
}
public class linkedlist {
node head;
node tail;
int size;
public void insert( int val) {
	 node nn = new node(val);

	    if(head == null) {
	        head = tail = nn;
	    }
	    else {
	        tail.next = nn;
	        tail = nn;
	    }

	    size++;
	}
public void delete() {
	  if(head == null) {
	        System.out.println("nothing to delete");
	        return;
	    }

	    head = head.next;

	    if(head == null) {
	        tail = null;
	    }

	    size--;
	}
public void peek() {
	if(head==null) {
		System.out.print("nothing at top");
				return;
	}
	System.out.println(head.val);
}
public void display() {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.val+"->");
		temp=temp.next;
	}
	System.out.println();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist q= new linkedlist();
		q.insert(10);
		q.insert(20);
		q.insert(70);
		q.insert(80);
		q.display();
		q.delete();
		q.display();

	}

}
