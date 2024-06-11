public class HeightOfTree {
    public static int HeightOFtree(ListNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=HeightOFtree(root.left);
        int right=HeightOFtree(root.right);
        int max=Math.max(left,right);
        return max+1;
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(10);
        root.left=new ListNode(20);
        root.right=new ListNode(30);
        root.left.left=new ListNode(40);
        root.right.left=new ListNode(50);
        root.right.right=new ListNode(60);

        System.out.println(HeightOFtree(root));
    }
}
