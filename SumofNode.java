public class SumofNode {
    public static int sumofNode(ListNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int sumleft=sumofNode(root.left);
        int sumright=sumofNode(root.right);
        return sumleft + sumright + root.data;
    }

    public static void main(String[] args) {
        ListNode root=new ListNode(10);
        root.left=new ListNode(20);
        root.right=new ListNode(30);
        root.left.left=new ListNode(40);
        root.right.left=new ListNode(50);
        root.right.right=new ListNode(60);
        //   levelTraversal(root);

        System.out.print(sumofNode(root));
    }
}
