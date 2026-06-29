package practice_revision;

public class q2 {
int arr[]=new int[5];
int rear=-1;
int front=0;
int size=0;
public void enqueue(int val) {
	if(size==arr.length) {
		System.out.println("FULL");
		return;
	}
	if(size==0) {
		System.out.println("EMPTY");
		return;
	}
	if(rear==arr.length-1) {
		rear=0;
	}else {
		rear++;
		size++;
	}
}
public void dequeue() {
	if(size==0) {
		System.out.println("queue is empty");
		return;
	}
	if(size==arr.length) {
		System.out.println("queue is full");
		return;
	}
	if(front==arr.length-1) {
		front=0;
	}else {
		front++;
		size--;
	}
}
public int peek() {
    if (size==0) {
        System.out.println("Queue is Empty!");
        return -1;
    }
    return arr[front];
}
public void display() {

    if (size==0) {
        System.out.println("Queue is Empty!");
        return;
    }

    System.out.println("-----------------------------");

    int index = front;
    int count = 0;

    while (count < size) {

        // show FRONT label
        if (index == front) {
            System.out.print("FRONT --> ");
        }

        // show REAR label
        if (index == rear) {
            System.out.print(arr[index] + " <-- REAR");
        } else {
            System.out.print(arr[index]);
        }

        System.out.println();

        // move forward with wrap
        if (index == size- 1) {
            index = 0;
        } else {
            index++;
        }

        count++;
    }

    System.out.println("-----------------------------");
    System.out.println("Size: " + size + "/" + size);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 q2 cq = new q2();

	        System.out.println("=== Enqueue 10, 20, 30, 40 ===");
	        cq.enqueue(10);
	        cq.enqueue(20);
	        cq.enqueue(30);
	        cq.enqueue(40);
	        cq.display();

	        System.out.println("=== Dequeue twice ===");
	       cq.dequeue();
	        cq.dequeue();
	        cq.display();

	        System.out.println("=== Enqueue 50, 60 (wraps around) ===");
	        cq.enqueue(50);
	        cq.enqueue(60);
	        cq.display();

	}

}
