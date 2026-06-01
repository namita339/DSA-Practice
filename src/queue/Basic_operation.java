package queue;
import java.util.Queue;
import java.util.LinkedList;
public class Basic_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q+" "+q.size());

	}

}
