class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        data = val;
        left = null;
        right = null;
    }

}

public class postorderTraversal 
{
    static void postorder(Node node)
    {
        if(node == null) 
            return;
        
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Postorder traversal of binary tree is : ");
        postorder(root);
    }

}
