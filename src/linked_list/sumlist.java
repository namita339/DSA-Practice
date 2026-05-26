package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class sumlist {
node head;
public node sum(node head1,node head2) {
	node t1=head1;
	node t2=head2;
	int carry=0;
	node dummy=new node(-1);
	node curr=dummy;
	while(t1!=null || t2!=null || carry!=0) {
		int sum=carry;
		if(t1!=null) {
			sum=sum+t1.data;
			t1=t1.next;
		}
		if(t2!=null) {
			sum=sum+t2.data;
			t2=t2.next;
		}
		int digit=sum%10;
		carry=sum/10;
		curr.next=new node(digit);
		curr=curr.next;
	}
	return dummy.next;
}
public void print(node head) {

    node temp = head;

    while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }

    System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumlist obj=new sumlist();
		
	    node head1 = new node(2);
        head1.next = new node(4);
        head1.next.next = new node(3);

        // Second linked list: 5 -> 6 -> 4
        node head2 = new node(5);
        head2.next = new node(6);
        head2.next.next = new node(4);

        // Add lists
        node result = obj.sum(head1, head2);

        // Print result
        obj.print(result);
	}

}
