package pekan6_2511531020;

public class InsertDLL_2511531020 {
    // menambahkan node di awal DLL
    static NodeDLL_2511531020 insertBegin_1020(NodeDLL_2511531020 head_1020, int data_1020){
        NodeDLL_2511531020 new_node_1020 = new NodeDLL_2511531020(data_1020);
        new_node_1020.next_1020 = head_1020;
        if (head_1020 != null){
            head_1020.prev_1020 = new_node_1020;
        }
        return new_node_1020;
    }

    // fungsi menambahkan node di akhir
    public static NodeDLL_2511531020 insertEnd_1020(NodeDLL_2511531020 head_1020, int newData_1020){
        NodeDLL_2511531020 newNode_1020 = new NodeDLL_2511531020(newData_1020);
        if (head_1020 == null){
            head_1020 = newNode_1020;
        } else {
            NodeDLL_2511531020 curr_1020 = head_1020;
            while (curr_1020.next_1020 != null){
                curr_1020 = curr_1020.next_1020;
            }
            curr_1020.next_1020 = newNode_1020;
            newNode_1020.prev_1020 = curr_1020;
        }
        return head_1020;
    }

    // fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511531020 insertAtPosition_1020(NodeDLL_2511531020 head_1020, int pos_1020, int new_data_1020) {
        NodeDLL_2511531020 new_node_1020 = new NodeDLL_2511531020(new_data_1020);
        if (pos_1020 == 1) {
            new_node_1020.next_1020 = head_1020;
            if (head_1020 != null) {
                head_1020.prev_1020 = new_node_1020;
            }
            head_1020 = new_node_1020;
            return head_1020;
        }
        NodeDLL_2511531020 curr_1020 = head_1020;
        for (int i_1020 = 1; i_1020 < pos_1020 - 1 && curr_1020 != null; ++i_1020) {
            curr_1020 = curr_1020.next_1020;
        }
        if (curr_1020 == null) {
            System.out.println("Posisi tidak ada");
            return head_1020;
        }
        new_node_1020.prev_1020 = curr_1020;
        new_node_1020.next_1020 = curr_1020.next_1020;
        curr_1020.next_1020 = new_node_1020;
        if (new_node_1020.next_1020 != null) {
            new_node_1020.next_1020.prev_1020 = new_node_1020;
        }
        return head_1020;
    }

    public static void printList_1020(NodeDLL_2511531020 head_1020) {
        NodeDLL_2511531020 curr_1020 = head_1020;
        while (curr_1020 != null) {
            System.out.print(curr_1020.data_1020 + " <-> ");
            curr_1020 = curr_1020.next_1020;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511531020 head_1020 = new NodeDLL_2511531020(2);
        head_1020.next_1020 = new NodeDLL_2511531020(3);
        head_1020.next_1020.prev_1020 = head_1020;
        head_1020.next_1020.next_1020 = new NodeDLL_2511531020(5);
        head_1020.next_1020.next_1020.prev_1020 = head_1020.next_1020;

        System.out.print("DLL Awal: ");
        printList_1020(head_1020);

        head_1020 = insertBegin_1020(head_1020, 1);
        System.out.print("Simpul 1 ditambah di awal: ");
        printList_1020(head_1020);

        System.out.print("Simpul 6 ditambah di akhir: ");
        int data_1020 = 6;
        head_1020 = insertEnd_1020(head_1020, data_1020);
        printList_1020(head_1020);

        System.out.print("Tambah node 4 di posisi 4: ");
        int data2_1020 = 4;
        int pos_1020 = 4;
        head_1020 = insertAtPosition_1020(head_1020, pos_1020, data2_1020);
        printList_1020(head_1020);
    }
}
