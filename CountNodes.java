 class ListNode{
    int data;
    ListNode left;
    ListNode right;
    ListNode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class CountNodes {

    public static int CountOfNode(ListNode root)
    {
        //base Condition
       if(root==null)
       {
           return 0;
       }
       //recursion for counting the leftNode of the tree
       int countLeft=CountOfNode(root.left);
        //recursion for counting the rightNode of the tree
       int countRight=CountOfNode(root.right);


       //Recurence Relation is generated and return ;
        // total count of leftNode,rightNode and root of the tree
       return countLeft+countRight+1;
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(1);
        root.left=new ListNode(2);
        root.right=new ListNode(3);
        root.left.left=new ListNode(4);
        root.left.right=new ListNode(5);
        root.right.left=new ListNode(6);
        root.right.right=new ListNode(7);
        //calling the value and printiong the output count of nOde
        System.out.print(CountOfNode(root));
    }
}
