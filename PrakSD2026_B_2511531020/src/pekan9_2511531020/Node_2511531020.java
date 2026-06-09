package pekan9_2511531020;

public class Node_2511531020 {
    int data_1020;
    Node_2511531020 left_1020;
    Node_2511531020 right_1020;

    public Node_2511531020(int data_1020) {
        this.data_1020 = data_1020;
        left_1020 = null;
        right_1020 = null;
    }

    public void setLeft_1020(Node_2511531020 node_1020) {
        if (left_1020 == null)
            left_1020 = node_1020;
    }

    public void setRight_1020(Node_2511531020 node_1020) {
        if (right_1020 == null)
            right_1020 = node_1020;
    }

    public Node_2511531020 getLeft_1020() {
        return left_1020;
    }

    public Node_2511531020 getRight_1020() {
        return right_1020;
    }

    public int getData_1020() {
        return data_1020;
    }

    public void setData_1020(int data_1020) {
        this.data_1020 = data_1020;
    }

    // Traversal Preorder
    void printPreorder_1020(Node_2511531020 node_1020) {
        if (node_1020 == null)
            return;
        System.out.print(node_1020.data_1020 + " ");
        printPreorder_1020(node_1020.left_1020);
        printPreorder_1020(node_1020.right_1020);
    }

    // Traversal Postorder
    void printPostorder_1020(Node_2511531020 node_1020) {
        if (node_1020 == null)
            return;
        printPostorder_1020(node_1020.left_1020);
        printPostorder_1020(node_1020.right_1020);
        System.out.print(node_1020.data_1020 + " ");
    }

    // Traversal Inorder
    void printInorder_1020(Node_2511531020 node_1020) {
        if (node_1020 == null)
            return;
        printInorder_1020(node_1020.left_1020);
        System.out.print(node_1020.data_1020 + " ");
        printInorder_1020(node_1020.right_1020);
    }

    // Print struktur tree
    public String print_1020() {
        return this.print_1020("", true, "");
    }

    public String print_1020(String prefix, boolean isTail, String sb) {
        if (right_1020 != null) {
            right_1020.print_1020(prefix + (isTail ? "| " : "  "), false, sb);
        }
        System.out.println(prefix + (isTail ? "\\--" : "/--") + data_1020);
        if (left_1020 != null) {
            left_1020.print_1020(prefix + (isTail ? "  " : "|  "), true, sb);
        }
        return sb;
    }
}
