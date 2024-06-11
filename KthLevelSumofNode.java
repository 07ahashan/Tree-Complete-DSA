import java.util.LinkedList;
import java.util.Queue;

public class KthLevelSumofNode {
    public static int Sum(ListNode root,int k)
    {
        if(root==null)
        {
            return 0;
        }
        Queue<ListNode> q=new LinkedList<>();
        int KthSum=0;
        int count=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            ListNode curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                count++;
                if(q.isEmpty())
                {
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(curr.data +" ");
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    KthSum+=curr.left.data;
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    KthSum+=curr.left.data;
                }
            }
        }

        return KthSum;
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.left=new ListNode(2);
        root.right=new ListNode(3);
        root.left.left=new ListNode(4);
        root.right.left=new ListNode(5);
        root.right.right=new ListNode(6);
        root.right.right.right=new ListNode(7);

        System.out.println(Sum(root,3));
    }
}
