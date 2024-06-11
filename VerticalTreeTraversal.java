
import java.util.*;
public class VerticalTreeTraversal {
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

            Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);

            Queue<pair> q=new LinkedList<>();
            Map<Integer,ArrayList<Integer>> map=new TreeMap<>();

            q.add(new pair(0,root));
            while(!q.isEmpty())
            {
                pair curr=q.poll();
                if(map.containsKey(curr.hd))
                {
                    map.get(curr.hd).add(curr.root.data);
                }else{
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(curr.root.data);
                    map.put(curr.hd,temp);
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

            ArrayList<Integer> list = new ArrayList<>();
            for (ArrayList<Integer> vertical : map.values()) {
                list.addAll(vertical);
            }
            System.out.println(list);
        }
    }
