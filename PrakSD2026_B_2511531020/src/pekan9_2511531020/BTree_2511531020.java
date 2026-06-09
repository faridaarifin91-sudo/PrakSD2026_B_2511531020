package pekan9_2511531020;

public class BTree_2511531020 {
    private Node_2511531020 root_1020;
    private Node_2511531020 currentNode_1020;

    public BTree_2511531020() {
        root_1020 = null;
    }

    public boolean search_1020(int data_1020) {
        return search_1020(root_1020, data_1020);
    }

    private boolean search_1020(Node_2511531020 node_1020, int data_1020) {
        if (node_1020.getData_1020() == data_1020)
            return true;
        if (node_1020.getLeft_1020() != null)
            if (search_1020(node_1020.getLeft_1020(), data_1020))
                return true;
        if (node_1020.getRight_1020() != null)
            if (search_1020(node_1020.getRight_1020(), data_1020))
                return true;
        return false;
    }

    public void printInOrder_1020() {
        root_1020.printInorder_1020(root_1020);
    }

    public void printPreOrder_1020() {
        root_1020.printPreorder_1020(root_1020);
    }

    public Node_2511531020 getRoot() {
        return root_1020;
    }

    public boolean isEmpty_1020() {
        return root_1020 == null;
    }

    public int countNodes_1020() {
        return countNodes_1020(root_1020);
    }

    private int countNodes_1020(Node_2511531020 node_1020) {
        int count_1020 = 1;
        if (node_1020 == null) {
            return 0;
        } else {
            count_1020 += countNodes_1020(node_1020.getLeft_1020());
            count_1020 += countNodes_1020(node_1020.getRight_1020());
            return count_1020;
        }
    }

    public void print_1020() {
        root_1020.print_1020();
    }

    public Node_2511531020 getCurrent_1020() {
        return currentNode_1020;
    }

    public void setCurrent_1020(Node_2511531020 node_1020) {
        this.currentNode_1020 = node_1020;
    }

    public void setRoot_1020(Node_2511531020 root_1020) {
        this.root_1020 = root_1020;
    }

    public Node_2511531020 getRoot_1020() {
        return root_1020;
    }

	public void printPostOrder_1020() {
		root_1020.printPostorder_1020(root_1020);
		
	}
}
