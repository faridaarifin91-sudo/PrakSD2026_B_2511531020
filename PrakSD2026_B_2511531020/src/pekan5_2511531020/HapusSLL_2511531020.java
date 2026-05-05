package pekan5_2511531020;

public class HapusSLL_2511531020 {
    // fungsi untuk menghapus head
    public static NodeSLL_2511531020 deleteHead_1020(NodeSLL_2511531020 head_1020) {
        // jika SLL kosong 
        if (head_1020 == null) {
            return null;
        }
        // pindahkan head ke node berikutnya 
        head_1020 = head_1020.next_1020;
        // return head baru 
        return head_1020;
    }

    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511531020 removeLastNode_1020(NodeSLL_2511531020 head_1020) {
        // jika list kosong , return null 
        if (head_1020 == null) {
            return null;
        }
        // jika list satu node , hapus node dan return null
        if (head_1020.next_1020 == null) {
            return null;
        }
        // temukan node terakhir kedua 
        NodeSLL_2511531020 secondLast = head_1020;
        while (secondLast.next_1020.next_1020 != null) {
            secondLast = secondLast.next_1020;
        }
        // hapus node terakhir 
        secondLast.next_1020 = null;
        return head_1020;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511531020 deleteNode_1020(NodeSLL_2511531020 head_1020, int position_1020) {
        NodeSLL_2511531020 temp_1020 = head_1020;
        NodeSLL_2511531020 prev_1020 = null;

        // jika linked list null
        if (temp_1020 == null)
            return head_1020;

        // kasus 1: head dihapus
        if (position_1020 == 1) {
            head_1020 = temp_1020.next_1020;
            return head_1020;
        }

        // kasus 2: menghapus node di tengah
        for (int i_1020 = 1; temp_1020 != null && i_1020 < position_1020; i_1020++) {
            prev_1020 = temp_1020;
            temp_1020 = temp_1020.next_1020;
        }

        // jika ditemukan, hapus node
        if (temp_1020 != null) {
            prev_1020.next_1020 = temp_1020.next_1020;
        } else {
            System.out.println("Data tidak ada");
        }
        return head_1020;
    }

    // fungsi mencetak SLL
    public static void printList_1020(NodeSLL_2511531020 head_1020) {
        NodeSLL_2511531020 curr_1020 = head_1020;
        while (curr_1020.next_1020 != null) {
            System.out.print(curr_1020.data_1020 + "-->");
            curr_1020 = curr_1020.next_1020;
        }
        System.out.print(curr_1020.data_1020);
        System.out.println();
    }

    // kelas main
    public static void main(String[] args) {
        // buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511531020 head_1020 = new NodeSLL_2511531020(1);
        head_1020.next_1020 = new NodeSLL_2511531020(2);
        head_1020.next_1020.next_1020 = new NodeSLL_2511531020(3);
        head_1020.next_1020.next_1020.next_1020 = new NodeSLL_2511531020(4);
        head_1020.next_1020.next_1020.next_1020.next_1020 = new NodeSLL_2511531020(5);
        head_1020.next_1020.next_1020.next_1020.next_1020.next_1020 = new NodeSLL_2511531020(6);

        // cetak list awal
        System.out.println("List awal: ");
        printList_1020(head_1020);

        // hapus head
        head_1020 = deleteHead_1020(head_1020);
        System.out.println("List setelah head dihapus: ");
        printList_1020(head_1020);

        // hapus node terakhir
        head_1020 = removeLastNode_1020(head_1020);
        System.out.println("List setelah simpul terakhir dihapus: ");
        printList_1020(head_1020);

        // Deleting node at position 2
        int position_1020 = 2;
        head_1020 = deleteNode_1020(head_1020, position_1020);
        //print list after deletion
        System.out.println("List setelah posisi 2 dihapus: ");
        printList_1020(head_1020);
    }
}
