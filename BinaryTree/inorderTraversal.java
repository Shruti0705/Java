class Node
{
    int data;
    Node left, right;

    Node(int n)
    {
        data = n;
        left = null;
        right = null;
    }
}

class inorderTraversal 
{
    public static void inorder(Node node)
    {
        if(node == null) 
            return;

        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Inorder traversal of binary tree is : ");
        inorder(root);
    }
}
