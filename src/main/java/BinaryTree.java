public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);

        print(root);
    }

    private static void print(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
