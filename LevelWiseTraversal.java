import java.util.*;

class LevelWiseTraversal{
    public  static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void levelTraversal(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        while(!q.isEmpty())
        {
            if(root==null)
            {
                return;
            }
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                count++;
                if(q.isEmpty())
                {
                    break;
                }else
                {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.left=new Node(50);
        root.right.right=new Node(60);
        levelTraversal(root);

    }
}
