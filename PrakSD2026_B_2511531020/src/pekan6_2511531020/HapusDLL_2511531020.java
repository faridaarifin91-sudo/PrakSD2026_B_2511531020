package pekan6_2511531020;

public class HapusDLL_2511531020 {
    // fungsi menghapus node di awal
    public static NodeDLL_2511531020 delHead_1020(NodeDLL_2511531020 head_1020) {
        if (head_1020 == null) {
            return null;
        }
        NodeDLL_2511531020 temp_1020 = head_1020;
        head_1020 = head_1020.next_1020;
        if (head_1020 != null) {
            head_1020.prev_1020 = null;
        }
        return head_1020;
    }

    // fungsi menghapus node di akhir
    public static NodeDLL_2511531020 delLast_1020(NodeDLL_2511531020 head_1020) {
        if (head_1020 == null) {
            return null;
        }
        if (head_1020.next_1020 == null) {
            return null;
        }
        NodeDLL_2511531020 curr_1020 = head_1020;
        while (curr_1020.next_1020 != null) {
            curr_1020 = curr_1020.next_1020;
        }
        if (curr_1020.prev_1020 != null) {
            curr_1020.prev_1020.next_1020 = null;
        }
        return head_1020;
    }

    // fungsi menghapus node di posisi tertentu
    public static NodeDLL_2511531020 delPos_1020(NodeDLL_2511531020 head_1020, int pos_1020) {
        if (head_1020 == null) {
            return head_1020;
        }
        NodeDLL_2511531020 curr_1020 = head_1020;
        for (int i_1020 = 1; curr_1020 != null && i_1020 < pos_1020; ++i_1020) {
            curr_1020 = curr_1020.next_1020;
        }
        if (curr_1020 == null) {
            return head_1020;
        }
        if (curr_1020.prev_1020 != null) {
            curr_1020.prev_1020.next_1020 = curr_1020.next_1020;
        }
        if (curr_1020.next_1020 != null) {
            curr_1020.next_1020.prev_1020 = curr_1020.prev_1020;
        }
        if (head_1020 == curr_1020) {
            head_1020 = curr_1020.next_1020;
        }
        return head_1020;
    }

    // fungsi mencetak DLL
    public static void printList_1020(NodeDLL_2511531020 head_1020) {
        NodeDLL_2511531020 curr_1020 = head_1020;
        while (curr_1020 != null) {
            System.out.print(curr_1020.data_1020 + " <-> ");
            curr_1020 = curr_1020.next_1020;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeDLL_2511531020 head_1020 = new NodeDLL_2511531020(1);
        head_1020.next_1020 = new NodeDLL_2511531020(2);
        head_1020.next_1020.prev_1020 = head_1020;
        head_1020.next_1020.next_1020 = new NodeDLL_2511531020(3);
        head_1020.next_1020.next_1020.prev_1020 = head_1020.next_1020;
        head_1020.next_1020.next_1020.next_1020 = new NodeDLL_2511531020(4);
        head_1020.next_1020.next_1020.next_1020.prev_1020 = head_1020.next_1020.next_1020;
        head_1020.next_1020.next_1020.next_1020.next_1020 = new NodeDLL_2511531020(5);
        head_1020.next_1020.next_1020.next_1020.next_1020.prev_1020 = head_1020.next_1020.next_1020.next_1020;

        System.out.print("DLL Awal: ");
        printList_1020(head_1020);

        System.out.print("Setelah head dihapus: ");
        head_1020 = delHead_1020(head_1020);
        printList_1020(head_1020);

        System.out.print("Setelah node terakhir dihapus: ");
        head_1020 = delLast_1020(head_1020);
        printList_1020(head_1020);

        System.out.print("Menghapus node ke-2: ");
        head_1020 = delPos_1020(head_1020, 2);
        printList_1020(head_1020);
    }
}
