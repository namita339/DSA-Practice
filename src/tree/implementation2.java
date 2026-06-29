package tree;
class node{
	int value;
	node left;
	node right;
	node(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
public class implementation2 {
public int  size(node root) {
	if(root==null) return 0;
	return 1+size(root.left)+size(root.right);
}
public int sum(node root) {
	if(root==null) return 0;
	int sum=root.value;
	return sum+sum(root.left)+ sum(root.right);
 }
public int product(node root) {
	if(root==null) return 1;
	return root.value*product(root.left)*product(root.right);
}
public int max1(node root) {
	if(root==null) return Integer.MIN_VALUE;

return Math.max(root.value,Math.max(max1(root.left),max1(root.right)));
}
public int min(node root) {
	if(root==null) return Integer.MAX_VALUE;

return Math.min(root.value,Math.min(min(root.left),min(root.right)));
}
public int levels(node root) {
	if(root==null) return 0;
	return 1+Math.max(levels(root.left), levels(root.right));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 node a = new node(3);
	        node b = new node(4);
	        node c = new node(2);
	        node d = new node(-1);
	        node e = new node(1);
	        node f = new node(1);
	        node g = new node(6);

	        // Connecting Nodes
	        a.left = b;
	        a.right = c;

	        b.left = d;
	        b.right = e;

	        c.left = f;
	        c.right = g;
	        implementation2 obj=new implementation2();
	        System.out.println(obj.size(a));
	        System.out.println(obj.levels(a));
	        System.out.println(obj.max1(a));
	        System.out.println(obj.min(a));
	        System.out.println(obj.sum(a));
	        System.out.println(obj.product(a));
	        

	}

}
