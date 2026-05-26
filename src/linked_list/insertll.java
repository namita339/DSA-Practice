package linked_list;
class Node { 
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class insertll {
Node head;
Node tail;
void insertATfirst(int val) {
	Node temp=new Node(val);
	if(head==null) {
		head=tail=temp;
	}
	temp.next=head;
	head=temp;
}
void insertAtlast(int val) {
	Node temp=new Node(val);
	if(tail==null) {
		head=tail=temp;
	}
	tail.next=temp;
	tail=temp;
}
void deleteAtfirst() {
	if(head == null) {
        System.out.println("List is empty");
        return;
    }

    if(head == tail) {
        head = tail = null;
        return;
    }

	head=head.next;
}
void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}

    System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
insertll list=new insertll();
list.insertATfirst(10);
list.insertATfirst(20);
list.insertATfirst(30);
list.insertATfirst(40);
list.insertAtlast(23);
list.insertAtlast(2);
list.display();

list.deleteAtfirst();

list.display();


	}

}
