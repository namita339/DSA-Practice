package queue;
import java.util.Queue;
import java.util.LinkedList;
public class atanyindex {
	
	Queue<Integer> q=new LinkedList<>();
	

public void insertat(int val,int idx) {
	 if(idx < 0 || idx > q.size()) {
         System.out.println("Invalid Index");
         return;
     }
	int n = q.size();
	for(int i=0;i<idx;i++) {
		q.add(q.remove());
	}
	q.add(val);
	
	for(int i=0;i<n-idx;i++) {
		q.add(q.remove());
	}
}
public void remove(int idx) {
	if(idx < 0 || idx >= q.size()) {
        System.out.println("Invalid Index");
        return;
    }
	for(int i=0;i<idx;i++) {
		q.add(q.remove());
	}
	q.remove();
	int n=q.size();
	for(int i=0;i<n-idx-1;i++) {
		q.add(q.remove());

	}
}
public void peek(int idx) {
	if(idx < 0 || idx >= q.size()) {
        System.out.println("Invalid Index");
        return;
    }
	for(int i=0;i<idx;i++) {
		q.add(q.remove());
	}
	int n=q.size();
	System.out.print(q.peek());
	 for(int i = 0; i < n- idx; i++) {
         q.add(q.remove());
     }
 }
public void display() {
    System.out.println(q);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 atanyindex obj = new atanyindex();

	        obj.q.add(10);
	        obj.q.add(20);
	        obj.q.add(30);
	        obj.q.add(40);

	        System.out.println("Original Queue:");
	        obj.display();

	        obj.insertat(25, 2);
	        System.out.println("After Inserting 25 at index 2:");
	        obj.display();

	        obj.peek(3);

	        obj.remove(1);
	        System.out.println("After Removing index 1:");
	        obj.display();

	}

}
