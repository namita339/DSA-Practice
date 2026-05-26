package linked_list;
class node{
	int data;
	node next;
	node prev;
	node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class doublyll {
node head;
node tail;
public void insertAtfirst(int val) {
	node nn=new node(val);
	if(head==null) {
		head=tail=nn;
		return;
	}
	nn.next=head;
	head.prev=nn;
	head=nn;
}
public void insertAtlast(int val) {
	node nn=new node(val);
	if(head==null) {
		head=tail=nn;
		return;
	}
	tail.next=nn;
	nn.prev=tail;
	tail=nn;
}
public void displayfor() {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	
	
}
public void displayback() {
	node temp=tail;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.prev;
	}
}
public void insertAtpos(int val,int k) {
	node temp=head;
	node nn=new node(val);
	if(head==null) {
		head=tail=nn;
		return;
	}
	for(int i=0;i<k;i++) {
		temp=temp.next;
	}
	nn.next=temp.next;
	temp.next.prev=nn;
	temp.next=nn;
	nn.prev=temp;
	
	
}
public void deleteAtpos(int k) {

    if(head == null) {
        return;
    }

    // delete first node
    if(k == 0) {
        head = head.next;

        if(head != null) {
            head.prev = null;
        }

        return;
    }

    node temp = head;

    for(int i=0; i<k; i++) {
        temp = temp.next;
    }

    // connect previous node
    temp.prev.next = temp.next;

    // if not deleting last node
    if(temp.next != null) {
        temp.next.prev = temp.prev;
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublyll list=new doublyll();
		list.insertAtfirst(10);
		list.insertAtfirst(20);
		list.insertAtfirst(30);
		list.insertAtfirst(40);
		list.insertAtfirst(50);
		 System.out.println("Forward:");
		    list.displayfor();

		    System.out.println();

		    System.out.println("Backward:");
		    list.displayback();

		    System.out.println();

		    list.deleteAtpos(2);

		    System.out.println("After deletion:");
		    list.displayfor();
		}		

	}

}
