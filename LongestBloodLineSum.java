public class LongestBloodLineSum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node root)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int BloodlineSum(int len,int maxLen,int sum,int maxSum,ListNode root)
    {
        if(root==null)
        {
            if(len>maxLen)
            {
                maxLen=len;
                maxSum=sum;
            } else if (len == maxLen){
                maxSum=sum;
            }
            return maxLen;
        }

        sum=sum+root.data;
        BloodlineSum(len+1,maxLen, sum,maxSum,root.left);
        BloodlineSum(len+1,maxLen, sum,maxSum,root.right);
        return maxLen;
    }
    public static void main(String[] args) {
        ListNode root=new ListNode(10);
        root.left=new ListNode(20);
        root.right=new ListNode(30);
        root.left.left=new ListNode(40);
        root.right.left=new ListNode(50);
        root.right.right=new ListNode(60);
        root.right.right.right=new ListNode(70);
        int len=0;
        int maxLen=0;
        int sum=0;
        int maxSum=0;
        System.out.println(BloodlineSum(len,maxLen,sum,maxSum,root));

    }
}
