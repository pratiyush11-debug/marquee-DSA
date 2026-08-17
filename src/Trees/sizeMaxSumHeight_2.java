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
//       preorderTraversal(root);
        System.out.println(size(root));






    }

}
