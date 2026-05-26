package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class all_operation {
node head;
node tail;
void length() {
	node temp=head;
	int count=0;
	if(head==null) {
		return;
	}
	while(temp!=null) {
		count++;
		temp=temp.next;
	}
}
boolean search(int key) {
	node temp=head;
	while(temp!=null) {
		if(temp.data==key) {
			return true;
		}
		temp=temp.next;
	}
	return false;
}
void insertATfirst(int val) {
	 node t = new node(val);

	    t.next = head;
	    head = t;
}
void deleteAtlast() {
	if(head==null) {
		return;
	}
	head=head.next;
}
void insertAtposition(int val,int index) {
	node t=new node(val);
	node temp=head;
	if(index==1) {
		t.next=head;
		head=t;
		return;
	}
	for(int i=0;i<index-1;i++) {
		temp=temp.next;
	}
	t.next=temp.next;
	temp.next=t;
}
void deleteAtposition(int index) {
	node temp=head;
	if(head==null) {
		return;
	}

if(index == 1){
    head = head.next;
    return;
}
	for(int i=0;i<index-1;i++) {
		temp=temp.next;
	}
	temp.next=temp.next.next;
}
void display() {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.data);
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		all_operation l=new all_operation();
		l.insertATfirst(10);
		l.insertATfirst(20);
		l.insertATfirst(30);
		l.insertATfirst(90);
		l.display();
		l.insertAtposition(100,3);
		l.display();
		l.deleteAtposition(2);
		l.display();

	}

}
