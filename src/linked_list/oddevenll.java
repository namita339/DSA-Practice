package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class oddevenll {
node head;
node tail;
public node  length() {
	if(head==null || head.next == null) {
		return head;
	}
	node odd=head;
	node even=head.next;
	node evenhead=head.next;
	while(even!=null && even.next!=null) {
		odd=odd.next.next;
		even=even.next.next;
		odd=odd.next;
		even=even.next;
	}
	odd.next=evenhead;
	if(even!=null) {
		even=even.next;
	}
	return head;
	
	
}
public void insert(int value){

    node nn = new node(value);

    if(head == null){
        head = tail = nn;
        return;
    }

    tail.next = nn;
    tail = nn;
}

public void display(node head){

    node temp = head;

    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     oddevenll list = new oddevenll();

	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        list.display(list.head);

	        node ans = list.length();

	        list.display(ans);

	}

}
