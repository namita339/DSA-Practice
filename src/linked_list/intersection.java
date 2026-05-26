package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
	
}
public class intersection {
node head;
node tail;
public int inter(node head1,node head2) {
	node temp1=head1;
	node temp2=head2;
	int length1=0;
	int length2=0;
	while(temp1!=null) {
		length1++;
		temp1=temp1.next;
	}
	while(temp2!=null) {
		length2++;
		temp2=temp2.next;
	}
	temp1=head1;
	temp2=head2;
	if(length1>length2) {
		for(int i=0;i<length1-length2;i++) {
			temp1=temp1.next;
		}
	}else {
		for(int i=0;i<length2-length1;i++) {
			temp2=temp2.next;
		}
	}
	while(temp1!=temp2) {
		temp1=temp1.next;
		temp2=temp2.next;
	}
	
	return temp1.data;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        intersection obj = new intersection();

        // common part
        node common = new node(30);
        common.next = new node(40);
        common.next.next = new node(50);

        // first list
        node head1 = new node(10);
        head1.next = new node(20);
        head1.next.next = common;

        // second list
        node head2 = new node(5);
        head2.next = common;

        System.out.println("Intersection Point: " + obj.inter(head1, head2));

	}

}
