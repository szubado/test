package pl.camp.it;

public class Tree {
    Node root;
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
