package tree;

class node {
    int value;
    node left;
    node right;

    node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class implementation1 {

    public void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    
    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

   
    public void postorder(node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {

        // Creating Nodes
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

        implementation1 tree = new implementation1();

        System.out.println("Preorder Traversal:");
        tree.preorder(a);

        System.out.println("\n");

        System.out.println("Inorder Traversal:");
        tree.inorder(a);

        System.out.println("\n");

        System.out.println("Postorder Traversal:");
        tree.postorder(a);
    }
}
