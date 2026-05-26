package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class palindromell {
node head;
node tail;
public boolean check() {
	node slow=head;
	node fast=head;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	node curr=slow;
	node prev=null;
	node next=null;
	while(curr!=null) {
		next=curr.next;
		curr.next=prev;
		prev=curr;
		curr=next;
		
		
	}
	node first=head;
	node second=prev;
	 while(second != null){

         if(first.data != second.data){
             return false;
         }

         first = first.next;
         second = second.next;
     }

     return true;
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
public void display() {
	node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ->");
		temp=temp.next;
	}
	 System.out.println("null");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
palindromell p=new palindromell();
p.insert(1);
p.insert(2);
p.insert(3);
p.insert(2);
p.insert(2);
p.insert(1);
p.display();

System.out.println(p.check());
	}

}
