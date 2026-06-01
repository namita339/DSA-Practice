package queue;
import java.util.Queue;
import java.util.LinkedList;
public class rearrangeele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        Queue<Integer> q2 = new LinkedList<>();

        int n = q.size() / 2;

        for(int i = 0; i < n; i++) {
            q2.add(q.remove());
        }

        while(!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
