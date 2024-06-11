
public class Subtree {
    public static boolean isIdentical(ListNode root,subTree Root)
    {
        if(root==null && Root == null)
        {
            return true;
        }
        if(root==null || Root == null)
        {
            return true;
        }
        if(root.data==Root.data)
        {
            return isIdentical(root.left,Root.left) && isIdentical(root.right,Root.right);
        }
        return false;
    }
static class subTree{
    int data;
    subTree left;
    subTree right;
    subTree(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
    public static boolean isSubtree(ListNode root,subTree Root)
    {
        //base case for the recursion
        if(Root==null)
        {
            return true;
        }
        if(root==null)
        {
            return false;
        }
        if(root.data==Root.data)
        {
            if(isIdentical(root,Root))
            {
                return true;
            }
        }
        return isSubtree(root.left,Root) || isSubtree(root.right,Root);
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.left=new ListNode(2);
        root.right=new ListNode(3);
        root.left.left=new ListNode(4);
        root.right.left=new ListNode(5);
        root.right.right=new ListNode(6);
        root.right.right.right=new ListNode(7);

        subTree Root=new subTree(2);
        Root.left=new subTree(4);
//        Root.right=new subTree(7);
        System.out.println(isSubtree(root,Root));
    }
}
