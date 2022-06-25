package genericbst;

class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinarySearchTree(T value) {
        root = new Node<T>(value);
    }

    public void insert(T value) {
        Node<T> node = new Node<T>(value);
        // insert logic goes here to search and insert
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}