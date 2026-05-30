package queue;
public class implearray {
	int[] arr;
	int f;
	int r;
	int size;
	implearray(int capacity){
		arr=new int[capacity];
		f=r=0;
		
	}
public void add(int val) {
	if(size==arr.length) {
		System.out.println("Queue is full");
		return;
	}
	arr[r]=val;
	r=r+1;
	size++;
	if(r==arr.length) {
		r=0;
	}
	
}
public int remove() {
	if(size==0) {
		System.out.println("Queue is empty");
		return 0;
	}
	int value=arr[f];
	f=f+1;
	size--;
	if(f==arr.length) {
		f=0;
	}
	return value; 
}
public void peek() {
	if(size==0) {
		System.out.println("Queue is empty");
		return;
	}
	System.out.println(arr[f]);
}
public void display() {
	int i=f;
	for(int c=0;c<size;c++) {
		System.out.print(arr[i]+" ");
		i=i+1;
		if(i==arr.length) {
			i=0;
		}
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    implearray q = new implearray(5);
		q.add(10);
		q.add(20);
		q.add(30);
		q.remove();
		q.remove();
		 q.display();
		q.peek();
		 q.add(50);
		    q.add(60);
		    q.display();
		    q.remove();
		    q.display();
		    

	}

}
