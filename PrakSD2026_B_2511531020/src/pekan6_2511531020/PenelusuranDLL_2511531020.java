package pekan6_2511531020;

public class PenelusuranDLL_2511531020 {
    // fungsi penelusuran maju
    static void forwardTraversal_1020(NodeDLL_2511531020 head_1020) {
        NodeDLL_2511531020 curr_1020 = head_1020;
        while (curr_1020 != null) {
            System.out.print(curr_1020.data_1020 + " <-> ");
            curr_1020 = curr_1020.next_1020;
        }
        System.out.println();
    }

    // fungsi penelusuran mundur
    static void backwardTraversal_1020(NodeDLL_2511531020 tail_1020) {
        NodeDLL_2511531020 curr_1020 = tail_1020;
        while (curr_1020 != null) {
            System.out.print(curr_1020.data_1020 + " <-> ");
            curr_1020 = curr_1020.prev_1020;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // membuat dll 1 <-> 2 <-> 3
        NodeDLL_2511531020 head_1020 = new NodeDLL_2511531020(1);
        NodeDLL_2511531020 second_1020 = new NodeDLL_2511531020(2);
        NodeDLL_2511531020 third_1020 = new NodeDLL_2511531020(3);

        head_1020.next_1020 = second_1020;
        second_1020.prev_1020 = head_1020;
        second_1020.next_1020 = third_1020;
        third_1020.prev_1020 = second_1020;

        System.out.println("Penelusuran maju: ");
        forwardTraversal_1020(head_1020);

        System.out.println("Penelusuran mundur: ");
        backwardTraversal_1020(third_1020);
    }
}
