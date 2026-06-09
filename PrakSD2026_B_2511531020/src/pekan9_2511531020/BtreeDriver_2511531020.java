package pekan9_2511531020;

public class BtreeDriver_2511531020 {
    public static void main(String[] args) {
        // Membuat Pohon
        BTree_2511531020 tree_1020 = new BTree_2511531020();

        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree_1020.countNodes_1020());

        // Menambahkan simpul data 1
        Node_2511531020 root_1020 = new Node_2511531020(1);

        // Menjadikan simpul 1 sebagai root
        tree_1020.setRoot_1020(root_1020);

        System.out.println("Jumlah simpul jika hanya ada root: ");
        System.out.println(tree_1020.countNodes_1020());

        Node_2511531020 node2_1020 = new Node_2511531020(2);
        Node_2511531020 node3_1020 = new Node_2511531020(3);
        Node_2511531020 node4_1020 = new Node_2511531020(4);
        Node_2511531020 node5_1020 = new Node_2511531020(5);
        Node_2511531020 node6_1020 = new Node_2511531020(6);
        Node_2511531020 node7_1020 = new Node_2511531020(7);
        Node_2511531020 node8_1020 = new Node_2511531020(8);
        Node_2511531020 node9_1020 = new Node_2511531020(9);

        root_1020.setLeft_1020(node2_1020);
        node2_1020.setLeft_1020(node4_1020);
        node2_1020.setRight_1020(node5_1020);
        node4_1020.setRight_1020(node8_1020);
        root_1020.setRight_1020(node3_1020);
        node3_1020.setLeft_1020(node6_1020);
        node3_1020.setRight_1020(node7_1020);
        node6_1020.setLeft_1020(node9_1020);
     // Set root
        tree_1020.setCurrent_1020(tree_1020.getRoot_1020());

        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree_1020.getCurrent_1020().getData_1020());

        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan: ");
        System.out.println(tree_1020.countNodes_1020());

        System.out.println("InOrder: ");
        tree_1020.printInOrder_1020();

        System.out.println("\nPreOrder: ");
        tree_1020.printPreOrder_1020();

        System.out.println("\nPostOrder: ");
        tree_1020.printPostOrder_1020();

        System.out.println("\nMenampilkan simpul dalam bentuk pohon");
        tree_1020.print_1020();
    }
}
