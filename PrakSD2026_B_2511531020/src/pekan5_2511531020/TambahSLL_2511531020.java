package pekan5_2511531020;

public class TambahSLL_2511531020 {
	public static NodeSLL_2511531020 insertAtFront_1020(NodeSLL_2511531020 head_1020, int value_1020) {
        NodeSLL_2511531020 newNode_1020 = new NodeSLL_2511531020(value_1020);
        newNode_1020.next_1020 = head_1020;
        return newNode_1020;
    }

    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511531020 insertAtEnd_1020(NodeSLL_2511531020 head_1020, int value_1020) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511531020 newNode_1020 = new NodeSLL_2511531020(value_1020);

        // jika list kosong maka node jadi head
        if (head_1020 == null) {
            return newNode_1020;
        }

        // simpan head ke variabel sementara
        NodeSLL_2511531020 last_1020 = head_1020;

        // telusuri ke node akhir
        while (last_1020.next_1020 != null) {
            last_1020 = last_1020.next_1020;
        }

        // ubah pointer
        last_1020.next_1020 = newNode_1020;
        return head_1020;
    }

    // fungsi membuat node baru
    static NodeSLL_2511531020 GetNode_1020(int data_1020) {
        return new NodeSLL_2511531020(data_1020);
    }

static NodeSLL_2511531020 insertPos_1020(NodeSLL_2511531020 headNode_1020, int position_1020, int value_1020) {
    NodeSLL_2511531020 head_1020 = headNode_1020;
    if (position_1020 < 1)
        System.out.print("Invalid position");
    if (position_1020 == 1) {
        NodeSLL_2511531020 new_node_1020 = new NodeSLL_2511531020(value_1020);
        new_node_1020.next_1020 = head_1020;
        return new_node_1020;
    } else {
        while (position_1020-- != 0) {
            if (position_1020 == 1) {
                NodeSLL_2511531020 newNode_1020 = GetNode_1020(value_1020);
                newNode_1020.next_1020 = headNode_1020.next_1020;
                headNode_1020.next_1020 = newNode_1020;
                break;
            }
            headNode_1020 = headNode_1020.next_1020;
        }
        if (position_1020 != 1)
            System.out.print("Posisi di luar jangkauan");
        return head_1020;
    }
}

public static void printList_1020(NodeSLL_2511531020 head_1020) {
    NodeSLL_2511531020 curr_1020 = head_1020;
    while (curr_1020.next_1020 != null) {
        System.out.print(curr_1020.data_1020 + "-->");
        curr_1020 = curr_1020.next_1020;
    }
    if (curr_1020.next_1020 == null) {
        System.out.print(curr_1020.data_1020);
    }
    System.out.println();
}
public static void main (String [] args) {
	// buat linked list 2->3->4->5->6
	NodeSLL_2511531020 head_1020 = new NodeSLL_2511531020(2);
	head_1020.next_1020= new  NodeSLL_2511531020(3);
	head_1020.next_1020.next_1020 = new  NodeSLL_2511531020(5);
	head_1020.next_1020.next_1020.next_1020 = new  NodeSLL_2511531020(6);
	// cetak list asli 
	System.out.print("Senarai berantai awal:");
	printList_1020(head_1020);
	// tambahkan node baru di depan
    System.out.print("tambah 1 simpul di depan: ");
    int data_1020 = 1;
    head_1020 = insertAtFront_1020(head_1020, data_1020);

    // cetak update list
    printList_1020(head_1020);

    // tambahkan node baru di belakang
    System.out.print("tambah 1 simpul di belakang: ");
    int data2_1020 = 7;
    head_1020 = insertAtEnd_1020(head_1020, data2_1020);

    // cetak update list
    printList_1020(head_1020);

    System.out.print("tambah 1 simpul ke data 4: ");
    int data3_1020 = 4;
    int pos_1020 = 4;
    head_1020 = insertPos_1020(head_1020, pos_1020, data3_1020);

    // cetak update list
    printList_1020(head_1020);
}
}


