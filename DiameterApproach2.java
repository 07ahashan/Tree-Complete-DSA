public class DiameterApproach2 {
    public static class TreeNode{
        int height;
        int diam;

        TreeNode(int height,int diam)
        {
            this.diam=diam;
            this.height=height;
        }
    }
    public static TreeNode Diameter(ListNode root){
        if(root==null)
        {
            return new TreeNode(0,0);
        }
        TreeNode left=Diameter(root.left);
        TreeNode right=Diameter(root.right);
        int myHeight= Math.max(left.height, right.height)+1;

        int op1=left.diam;
        int op2=right.diam;
        int op3=left.diam+right.diam+1;

        int myDiam=Math.max(Math.max(op1,op2),op3);

        return new TreeNode(myHeight,myDiam);
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.left=new ListNode(2);
        root.right=new ListNode(3);
        root.left.left=new ListNode(4);
        root.right.left=new ListNode(5);
        root.right.right=new ListNode(6);
        root.right.right.right=new ListNode(7);
        System.out.println(Diameter(root).diam);

    }
}
