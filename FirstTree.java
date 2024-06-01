import org.w3c.dom.Node;

public class FirstTree {
    static class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void traverse(node node)
    {
        //Base case
        if(node==null)
        {
            return;
        }
        //pre-order traversal
//        System.out.println(node.data);
//        traverse(node.left);
//        traverse(node.right);

        //in-Order Traversal
//        traverse(node.left);
//        System.out.print(node.data+" ");
//        traverse(node.right);

        //post order traversal
        traverse(node.left);
        traverse(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        node root=new node(5);
        root.left=new node(10);
        root.right=new node(20);
        root.left.left=new node(12);
        root.right.left=new node(7);

        traverse(root);

    }
}
