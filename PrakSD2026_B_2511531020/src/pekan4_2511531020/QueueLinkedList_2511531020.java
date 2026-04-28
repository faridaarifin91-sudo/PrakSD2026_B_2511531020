package pekan4_2511531020;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511531020 {
    public static void main(String[] args) {
        Queue<Integer> q_1020 = new LinkedList<>();
        // tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
        for (int i = 0; i < 6; i++)
            q_1020.add(i);
        // Menampilkan isi antrian.
        System.out.println("Elemen Antrian " + q_1020);
        // Untuk menghapus kepala antrian.
        int hapus_1020 = q_1020.remove();
        System.out.println("Hapus elemen = " + hapus_1020);
        System.out.println(q_1020);
        // Untuk melihat antrian terdepan
        int depan_1020 = q_1020.peek();
        System.out.println("Kepala Antrian = " + depan_1020);

        int banyak_1020 = q_1020.size();
        System.out.println("Size Antrian = " + banyak_1020);
    }
}
