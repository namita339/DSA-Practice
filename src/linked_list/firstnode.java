package linked_list;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next=null;
	}
}
public class firstnode {
public node find(node head) {
	node slow=head;
	node fast=head;
	  while(fast != null && fast.next != null){

          slow = slow.next;
          fast = fast.next.next;

          if(slow == fast){

              node b = head;

              while(b != slow){
                  b = b.next;
                  slow = slow.next;
              }

              return slow;
          }
      }

      return null;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 firstnode obj = new firstnode();

		    node head = new node(10);
		    head.next = new node(20);
		    head.next.next = new node(30);
		    head.next.next.next = new node(40);
		    head.next.next.next.next = new node(50);

		    // creating loop
		    head.next.next.next.next.next = head.next;

		    node ans = obj.find(head);

		    System.out.println(ans.data);

	}

}
