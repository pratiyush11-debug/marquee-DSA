package Trees;

public class sizeMaxSumHeight_2 {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;//leaf node

        return 1+Math.max(height(root.left),height(root.right));

    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        //we have taken integer.minvalue because if we put return 0
        // and it will find maxmimum value as zero in left
        // and right node so if all the number is negative then
        // zero will the maximum so our ans will become wrong so
        // thats why me we ahve to integer .min value so thier will be no issue
        // in maximum..

        int a=root.val;
        int b=max(root.left);
        int c=max(root.right);
        return Math.max(a, (Math.max(b,c)));


    }
    //sum
    public static  int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    //size
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static void preorderTraversal(Node root){
        if(root==null)return;
        System.out.print(root.val + " ");

        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }


    public static void main(String[] args) {
        Node root= new Node(1);
        Node a=new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right=b;
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        a.left=c;
        a.right=d;
        b.right=e;
     preorderTraversal(root);
        System.out.println();
        System.out.println("the sum of tree is : " + sum(root));
        System.out.println("the max value in the tree is: " + max(root));
        System.out.println("the height of the tree is : " + height(root));






    }

}
