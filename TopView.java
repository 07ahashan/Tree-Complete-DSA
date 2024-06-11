import java.util.*;

public class TopView {
    static class Node{
        Node left;
        Node right;
        int data;
        Node (int data)
        {
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
    static class pair{
        int hd;
        Node root;
        pair(int hd,Node root)
        {
            this.hd=hd;
            this.root=root;
        }
    }
    public static void main(String[] args) {

        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(1);
//        root.left.left=new Node(4);
        root.left.right=new Node(3);
//        root.right.left=new Node(6);
        root.right.right=new Node(5);
        root.left.right.right=new Node(4);

        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();

        q.add(new pair(0,root));
        while(!q.isEmpty())
        {
            pair curr=q.poll();

            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd,curr.root.data);
            }
            if(curr.root.left!=null)
            {
                q.add(new pair(curr.hd-1,curr.root.left));
            }
            if(curr.root.right!=null)
            {
                q.add(new pair(curr.hd+1,curr.root.right));
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        System.out.println(list);
    }
}
