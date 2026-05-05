package pekan5_2511531020;

public class PencarianSLL_2511531020 {
	static boolean searchKey_1020 (NodeSLL_2511531020 head_1020, int key) {
		NodeSLL_2511531020 curr = head_1020;
		while (curr != null) {
			if (curr.data_1020 == key)
				return true;
			curr = curr.next_1020; }
		return false; }
	public static void traversal_1020 (NodeSLL_2511531020 head_1020) {
		// mulai dari head
		NodeSLL_2511531020 curr = head_1020;
		// telusuri sampai pointer null 
		while (curr != null) {
			System.out.print(" " + curr.data_1020);
			curr = curr.next_1020; }
		System.out.println();
    }

    public static void main_1020(String[] args_1020) {
        NodeSLL_2511531020 head_1020 = new NodeSLL_2511531020(14);
        head_1020.next_1020 = new NodeSLL_2511531020(21);
        head_1020.next_1020.next_1020 = new NodeSLL_2511531020(13);
        head_1020.next_1020.next_1020.next_1020 = new NodeSLL_2511531020(30);
        head_1020.next_1020.next_1020.next_1020.next_1020 = new NodeSLL_2511531020(10);

        System.out.print("Penelusuran SLL : ");
        traversal_1020(head_1020);

        // data yang akan dicari
        int key_1020 = 30;
        System.out.print("cari data " + key_1020 + " = ");
        if (searchKey_1020(head_1020, key_1020))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}