package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class removedup {
public node duplicates(node head) {
	node i=head;
	node j=head;
	while(j!=null) {
		if(i.data==j.data) {
			j=j.next;
		}else {
			i.next=j;
			i=j;
			j=j.next;
		}
	}
	i.next=j;
	return head;
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
		removedup list=new removedup();
		node n=new node(2);
		n.next = new node(2);
	    n.next.next = new node(3);
	    n.next.next.next = new node(3);
	    n.next.next.next.next = new node(50);
	    node ans = list.duplicates(n);

	    list.display(ans);

	}

}
