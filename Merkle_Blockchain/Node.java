package end_sem3;
public class Node {

    private Node left;
    private Node right;
    private String hash;

    public Node(Node left, Node right, String string) {
        this.left = left;
        this.right = right;
        this.hash = string;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}