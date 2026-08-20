package Trees;


public class MinAndProduct {
    public static class Node{
        int val;
        Node left;
        Node right;
        public  Node(int val){
            this.val=val;

        }

    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a=root.val;
        int b=min(root.left);
        int c= min(root.right);
        return Math.min(a, Math.min(b, c));

    }
    public static int product(Node root){
        if(root==null) return 1;
        int a=root.val;
        int b=product(root.left);
        int c=product(root.right);
        return a*b*c;

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
        System.out.println(min(root));
        System.out.println(product(root));




    }
}
